package com.mathroule.sample.room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mathroule.sample.room.database.SampleDatabase
import com.mathroule.sample.room.database.entity.Book
import com.mathroule.sample.room.database.entity.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = SampleDatabase.getDatabase(this)

        val sampleDao = database.sampleDao()

        val user = User(name = "John Smith")
        val userId = sampleDao.insert(user)

        val book = Book(userId = userId, title = "Android for dummies")
        sampleDao.insert(book)

        database.close()
    }
}
