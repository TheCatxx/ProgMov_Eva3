package com.example.eva3biblitrux.vistas.book

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.eva3biblitrux.database.TecsupRoomDatabase
import com.example.eva3biblitrux.model.Book
import com.example.eva3biblitrux.model.dao.BookDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BookRepository(application: Application) {

    private val bookDao: BookDao? = TecsupRoomDatabase.getInstance(application)?.libroDao()

    fun getBooks(): LiveData<List<Book>>{
        return bookDao?.getListBook()!!
    }

    suspend fun insertBookWithCorouties(book: Book){
        processInsertBook(book)
    }

    private suspend fun processInsertBook(book: Book){
        withContext(Dispatchers.Default){
            bookDao?.insert(book)
        }
    }
}

