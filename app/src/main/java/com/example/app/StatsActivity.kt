package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app.databinding.ActivityMainBinding
import com.example.app.databinding.ActivityStatsBinding

class StatsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStatsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.semana.setOnClickListener {
            Toast.makeText(this, "Filtro semana", Toast.LENGTH_SHORT).show()
        }

        binding.mes.setOnClickListener {
            Toast.makeText(this, "Filtro mes", Toast.LENGTH_SHORT).show()
        }

        binding.mes3.setOnClickListener {
            Toast.makeText(this, "Filtro 3 meses", Toast.LENGTH_SHORT).show()
        }
        binding.mes6.setOnClickListener {
            Toast.makeText(this, "Filtro 6 meses", Toast.LENGTH_SHORT).show()
        }

        binding.anio.setOnClickListener {
            Toast.makeText(this, "Filtro año", Toast.LENGTH_SHORT).show()
        }
    }
}