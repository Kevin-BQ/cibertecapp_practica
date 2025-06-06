package com.kevinbq.cibertecapp_r

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class NewsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val imageView = findViewById<ImageView>(R.id.img1)
        imageView.setOnClickListener {
            Toast.makeText(this, "Mostrar Detalle", Toast.LENGTH_LONG)
            startActivity(Intent(this, NewsDetails::class.java))
        }

    }
}