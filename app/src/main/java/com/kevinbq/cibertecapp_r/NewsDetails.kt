package com.kevinbq.cibertecapp_r

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewsDetails: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        val imagB = findViewById<ImageView>(R.id.imgB)
        imagB.setOnClickListener {
            Toast.makeText(this, "Regresar", Toast.LENGTH_LONG)
            startActivity(Intent(this, NewsActivity::class.java))
        }

    }
}