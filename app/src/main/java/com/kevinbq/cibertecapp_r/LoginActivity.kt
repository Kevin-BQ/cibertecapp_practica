package com.kevinbq.cibertecapp_r

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.jvm.java

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiy_login)

        val btnLogin = findViewById<Button>(R.id.btnLoginLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegisterLogin)

        btnRegister.setOnClickListener {
            Toast.makeText(this, "Mostrar pantalla Registrar", Toast.LENGTH_LONG)
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        btnLogin.setOnClickListener {
            Toast.makeText(this, "Mostrar pantalla Home", Toast.LENGTH_LONG)
            startActivity(Intent(this, NewsActivity::class.java))
        }

    }

}