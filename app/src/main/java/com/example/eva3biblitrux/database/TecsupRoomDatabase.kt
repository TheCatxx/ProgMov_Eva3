package com.example.eva3biblitrux.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.eva3biblitrux.model.Book
import com.example.eva3biblitrux.model.dao.BookDao

@Database(entities = [Book::class], version = 1)
abstract class TecsupRoomDatabase: RoomDatabase() {

    abstract fun libroDao(): BookDao

    companion object{

        private const val DATABASE_NAME = "Eva3_tecsup"

        @Volatile
        private var INSTANCE: TecsupRoomDatabase? = null

        fun getInstance(context: Context): TecsupRoomDatabase?{
            INSTANCE?: synchronized(this){
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    TecsupRoomDatabase::class.java,
                    DATABASE_NAME
                ).build()
            }
            return INSTANCE
        }
    }
}
