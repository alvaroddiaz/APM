package com.example.app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivityGastoGrupoBinding

class GastoGrupoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGastoGrupoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGastoGrupoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.openCamera.setOnClickListener {
            Toast.makeText(this, "Abrir camara", Toast.LENGTH_SHORT).show()
        }

        binding.gridLayoutMembersDebt.setOnClickListener{
            Toast.makeText(this, "Elegir deudores", Toast.LENGTH_SHORT).show()
        }
        binding.categoriaseleccionada.setOnClickListener{
            Toast.makeText(this, "Elegir categoría", Toast.LENGTH_SHORT).show()
        }

        binding.addGasto.setOnClickListener {
            Toast.makeText(this, "Añadir gasto", Toast.LENGTH_SHORT).show()
        }
    }
}
