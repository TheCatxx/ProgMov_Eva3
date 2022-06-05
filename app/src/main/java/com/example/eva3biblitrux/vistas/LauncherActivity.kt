package com.example.eva3biblitrux.vistas

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.eva3biblitrux.R

class LauncherActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val actionBar = supportActionBar
        actionBar?.hide()

        Handler(Looper.getMainLooper()).
                postDelayed({
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                }, 6000)
    }
}

