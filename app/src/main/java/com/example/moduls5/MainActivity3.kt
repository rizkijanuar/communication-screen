package com.example.moduls5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // INI MENUJU KE HALAMAN FINISH / BERHENTI
        val btnFinish = findViewById<Button>(R.id.btnFinish)
        btnFinish.setOnClickListener {
            finish()
        }


        // INI BACK KE HALAMAN MAINACTIVITY
        val beck = findViewById<ImageView>(R.id.beck)
        beck.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }

        // ini ke halaman terakhir
        val finish = findViewById<TextView>(R.id.finish)
        finish.setOnClickListener {
            finish()
        }
    }
}