package com.mathroule.sample.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mathroule.sample.room.database.entity.Book
import com.mathroule.sample.room.database.entity.User

@Database(
    entities = [
        Book::class,
        User::class
    ],
    version = 1,
    exportSchema = true
)
abstract class SampleDatabase : RoomDatabase() {

    abstract fun sampleDao(): SampleDao

    companion object {

        @Volatile
        private var INSTANCE: SampleDatabase? = null

        fun getDatabase(context: Context): SampleDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SampleDatabase::class.java,
                    "sample_database.db"
                ).allowMainThreadQueries() // Only for testing purpose
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
