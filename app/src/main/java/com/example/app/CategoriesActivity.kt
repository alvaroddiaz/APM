package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.app.databinding.ActivityCategoriesBinding

class CategoriesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.crearCategorias.add.setOnClickListener {
            startActivity(Intent(this, CreateCategoriesActivity::class.java))
        }

        binding.categoryComida.setOnClickListener {
            Toast.makeText(this, "Categoría comida", Toast.LENGTH_SHORT).show()
        }

        binding.categorySupermercado.setOnClickListener {
            Toast.makeText(this, "Categoría supermercado", Toast.LENGTH_SHORT).show()
        }

        binding.categorySalud.setOnClickListener {
            Toast.makeText(this, "Categoría salud", Toast.LENGTH_SHORT).show()
        }

        binding.categoryOcio.setOnClickListener {
            Toast.makeText(this, "Categoría ocio", Toast.LENGTH_SHORT).show()
        }

        binding.categoryCasa.setOnClickListener {
            Toast.makeText(this, "Categoría casa", Toast.LENGTH_SHORT).show()
        }

        binding.categoryRopa.setOnClickListener {
            Toast.makeText(this, "Categoría ropa", Toast.LENGTH_SHORT).show()
        }

        binding.categoryViaje.setOnClickListener {
            Toast.makeText(this, "Categoría viaje", Toast.LENGTH_SHORT).show()
        }

        binding.categoryTrabajo.setOnClickListener {
            Toast.makeText(this, "Categoría trabajo", Toast.LENGTH_SHORT).show()
        }
    }
}
