package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivityCategoriesBinding
import com.example.app.databinding.ActivityCreateCategoriesBinding

class CreateCategoriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCategoriesBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_create_categories)
    }
}