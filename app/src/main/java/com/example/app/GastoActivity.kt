package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivityGastoBinding
import com.example.app.databinding.ActivityGroupBinding

class GastoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGastoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGastoBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_gasto)
    }
}