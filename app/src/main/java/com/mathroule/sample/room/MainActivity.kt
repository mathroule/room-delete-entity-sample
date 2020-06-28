package com.mathroule.sample.room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mathroule.sample.room.database.Book
import com.mathroule.sample.room.database.User
import com.mathroule.sample.room.database.UserDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sampleDao = UserDatabase.getDatabase(this).sampleDao()

        val user = User(name = "John Smith")
        val userId = sampleDao.insert(user)

        val book = Book(userId = userId, title = "Android for dummies")
        sampleDao.insert(book)
    }
}
