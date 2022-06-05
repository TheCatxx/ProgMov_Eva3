package com.example.eva3biblitrux.vistas.book

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eva3biblitrux.R
import com.example.eva3biblitrux.model.Book

class BookViewHolder(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_book, parent, false)){

        private var textTitle: TextView? = null
        private var textAuthor: TextView? = null
        private var textGenero: TextView? = null
        private var textEditorial: TextView? = null
        private var textResumen: TextView? = null

        init{
            textTitle = itemView.findViewById(R.id.textTitle)
            textAuthor = itemView.findViewById(R.id.textAuthor)
            textGenero = itemView.findViewById(R.id.textCategory)
            textEditorial = itemView.findViewById(R.id.textEditorial)
            textResumen = itemView.findViewById(R.id.textDescription)
        }

        fun bind(book: Book){
            textTitle?.text = book.title
            textAuthor?.text = "Autor: " + book.autor
            textGenero?.text = "Categoría: " + book.genero
            textEditorial?.text = "Editorial: " + book.editorial
            textResumen?.text = book.resumen
        }
    }

