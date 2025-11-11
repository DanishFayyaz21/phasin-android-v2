package com.example.phasin_v2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.phasin_v2.databinding.ActivityPasswordBinding

class PasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the binding for this layout
        binding = ActivityPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Handle password matching live
        binding.confirmPassword.addTextChangedListener {
            val pass = binding.password.text.toString()
            val confirm = binding.confirmPassword.text.toString()

            when {
                pass.isEmpty() || confirm.isEmpty() -> {
                    binding.passwordMatchMsg.visibility = android.view.View.GONE
                }
                pass == confirm -> {
                    binding.passwordMatchMsg.text = "Passwords match."
                    binding.passwordMatchMsg.setTextColor(getColor(android.R.color.holo_green_dark))
                    binding.passwordMatchMsg.visibility = android.view.View.VISIBLE
                }
                else -> {
                    binding.passwordMatchMsg.text = "Passwords do not match."
                    binding.passwordMatchMsg.setTextColor(getColor(android.R.color.holo_red_dark))
                    binding.passwordMatchMsg.visibility = android.view.View.VISIBLE
                }
            }
        }

        // Button click
        binding.btnConfirm.setOnClickListener {
            val pass = binding.password.text.toString()
            val confirm = binding.confirmPassword.text.toString()

            if (pass.isNotEmpty() && pass == confirm) {
                Toast.makeText(this, "Password confirmed!", Toast.LENGTH_SHORT).show()
                finish() // Go back or navigate next
            } else {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
