package com.example.phasin_v2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.phasin_v2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSubmit.setOnClickListener {
            val name = binding.editName.text.toString()
            binding.textTitle.text = "Hello, $name!"
        }
    }
}
