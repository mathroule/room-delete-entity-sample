package com.mathroule.sample.room.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "user"
)
data class User(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    @ColumnInfo(name = "name") val name: String
)
