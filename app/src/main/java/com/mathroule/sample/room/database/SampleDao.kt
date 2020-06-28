package com.mathroule.sample.room.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.mathroule.sample.room.database.entity.Book
import com.mathroule.sample.room.database.entity.User

@Dao
abstract class SampleDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insert(user: User): Long
}
