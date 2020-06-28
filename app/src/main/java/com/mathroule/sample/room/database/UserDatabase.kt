package com.mathroule.sample.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        Book::class,
        User::class
    ],
    version = 1,
    exportSchema = true
)
public abstract class UserDatabase : RoomDatabase() {

    abstract fun sampleDao(): SampleDao

    companion object {

        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "sample_database"
                ).allowMainThreadQueries() // Only for testing purpose
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
