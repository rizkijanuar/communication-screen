package com.example.moduls5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // INI MENUJU KE HALAMAN MAINACTIVITY3
        val btnNextStep = findViewById<Button>(R.id.btnNextStep)
        btnNextStep.setOnClickListener {
            Intent(this, MainActivity3::class.java).also {
                startActivity(it)
            }
        }


        // INI BACK KE HALAMAN MAINACTIVITY
        val beck = findViewById<ImageView>(R.id.beck)
        beck.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        // ini ke halaman terakhir
        val nextsteps = findViewById<TextView>(R.id.nextsteps)
        nextsteps.setOnClickListener {
            Intent(this, MainActivity3::class.java).also {
                startActivity(it)
            }
        }

    }
}