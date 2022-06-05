package com.example.eva3biblitrux.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.eva3biblitrux.model.Book

@Dao
interface BookDao {

    @Insert
    fun insert(book: Book)

    @Update
    fun update(book: Book)

    @Delete
    fun delete(book: Book)

    @Query("SELECT * FROM book_table ORDER BY title_book DESC")
    fun getListBook(): LiveData<List<Book>>

    @Query("UPDATE book_table SET title_book=:title, autor_book=:autor, genero_book=:genero, editorial_book=:editorial, resumen_book=:resumen WHERE book_id=:id")
    fun update(title: String, autor: String, genero: String, editorial: String, resumen: String, id: Int)

}