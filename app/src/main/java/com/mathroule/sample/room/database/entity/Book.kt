package com.mathroule.sample.room.database.entity

import androidx.room.DatabaseView
import androidx.room.Embedded

@DatabaseView(
    viewName = "book",
    value = """
        SELECT user.*, "Book title"
        FROM user
    """
)
data class Book(
    @Embedded val user: User
)
