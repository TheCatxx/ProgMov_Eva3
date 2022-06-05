package com.example.eva3biblitrux.vistas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.eva3biblitrux.R
import com.example.eva3biblitrux.vistas.book.BookFragment

class HomeActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val actionBar = supportActionBar
        actionBar?.hide()

        openFragment(BookFragment.newInstance())
    }

    private fun openFragment(fragment: BookFragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment)
        transaction.commit()
    }
}

