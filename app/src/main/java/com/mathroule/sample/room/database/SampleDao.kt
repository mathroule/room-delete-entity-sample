package com.mathroule.sample.room.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
abstract class SampleDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insert(user: User): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insert(book: Book): Long
}
