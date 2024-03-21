package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.app.databinding.FragmentGroupBinding
import com.example.app.databinding.FragmentPersonalBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class GroupFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private var _binding: FragmentGroupBinding? = null
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
        _binding = FragmentGroupBinding.inflate(inflater, container, false)

        binding.cardgroup.root.setOnClickListener {
            val intent = Intent(context, GroupActivity::class.java)
            startActivity(intent)
        }

        binding.addGroup.add.setOnClickListener {
            Toast.makeText(context, "Añadir grupo", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}

