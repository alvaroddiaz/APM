package com.example.app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivityGastoBinding

class GastoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGastoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGastoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.openCamera.setOnClickListener {
            Toast.makeText(this, "Abrir camara", Toast.LENGTH_SHORT).show()
        }

        binding.addGasto.setOnClickListener {
            Toast.makeText(this, "Añadir gasto", Toast.LENGTH_SHORT).show()
        }
    }
}
