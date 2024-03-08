package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class gastos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastos)
        val buttonAdd = findViewById<ImageButton>(R.id.add)
        buttonAdd.setOnClickListener{
            val buttonAddIntent = Intent(this, crear_gasto::class.java)
            startActivity(buttonAddIntent)
        }
    }
}