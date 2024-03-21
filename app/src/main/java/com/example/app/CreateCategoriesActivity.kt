package com.example.app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivityCategoriesBinding
import com.example.app.databinding.ActivityCreateCategoriesBinding

class CreateCategoriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addCategory.setOnClickListener {
            Toast.makeText(this, "Crear categoria", Toast.LENGTH_SHORT).show()
        }
    }
}