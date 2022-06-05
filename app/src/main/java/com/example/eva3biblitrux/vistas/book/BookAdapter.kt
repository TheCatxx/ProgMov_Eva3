package com.example.eva3biblitrux.vistas.book

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.eva3biblitrux.model.Book

class BookAdapter : RecyclerView.Adapter<BookViewHolder>(){

    private var bookList = emptyList<Book>()

    fun setBook(books: List<Book>){
        this.bookList = books
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int = bookList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return BookViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book: Book = bookList[position]
        holder.bind(book)
    }
}

