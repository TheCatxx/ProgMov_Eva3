package com.example.eva3biblitrux.vistas.book

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.eva3biblitrux.model.Book
import kotlinx.coroutines.launch

class BookViewModel(application: Application): AndroidViewModel(application){

    private val repository = BookRepository(application)

    val books = repository.getBooks()

    fun saveBook(book: Book){
        viewModelScope.launch{
            repository.insertBookWithCorouties(book)
        }
    }
}

