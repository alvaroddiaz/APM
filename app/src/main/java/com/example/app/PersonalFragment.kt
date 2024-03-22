package com.example.app

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.app.databinding.FragmentPersonalBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class PersonalFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private var _binding: FragmentPersonalBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalBinding.inflate(inflater, container, false)

        binding.stats.setOnClickListener {
            val postIntent = Intent(context, StatsActivity::class.java)
            startActivity(postIntent)
        }

        binding.categories.setOnClickListener {
            val postIntent = Intent(context, CategoriesActivity::class.java)
            startActivity(postIntent)
        }

        binding.botonAdd.root.setOnClickListener {
            val postIntent = Intent(context, GastoActivity::class.java)
            startActivity(postIntent)
        }

        return binding.root
    }


}