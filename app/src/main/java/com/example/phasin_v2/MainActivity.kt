package com.example.phasin_v2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.phasin_v2.databinding.ActivityPasswordBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ Initialize the binding using the correct layout binding class
        setContentView(R.layout.activity_password)


        // ✅ Safe to use binding after initialization
//        binding.buttonSubmit.setOnClickListener {
//            val name = binding.editName.text.toString()
//            binding.textTitle.text = "Hello, $name!"
//        }
    }
}
