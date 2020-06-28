package com.mathroule.sample.room.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "user"
)
data class User(
    @ColumnInfo(name = "user_id") @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    @ColumnInfo(name = "user_name") val name: String
)
