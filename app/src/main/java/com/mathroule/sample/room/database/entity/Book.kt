package com.mathroule.sample.room.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.mathroule.sample.room.database.entity.User

@Entity(
    tableName = "book",
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["id"],
            childColumns = ["user_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Book(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    @ColumnInfo(name = "user_id") val userId: Long,
    @ColumnInfo(name = "title") val title: String
)
