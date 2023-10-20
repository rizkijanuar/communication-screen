package com.example.moduls5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TambahanScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambahan_screen)

        // INI MENUJU KE HALAMAN MAINACTIVITY
        val btnJoinNow = findViewById<Button>(R.id.btnJoinNow)
        btnJoinNow.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}