package com.jemutai.simplexml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jemutai.simplexml.databinding.ActivityAddNumbersBinding

class AddNumbers : AppCompatActivity() {

    private lateinit var binding: ActivityAddNumbersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNumbersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.add.setOnClickListener {
            val firstNumber = binding.fnumber.text.toString().toIntOrNull()
            val secondNumber = binding.snumber.text.toString().toIntOrNull()

            if (firstNumber != null && secondNumber != null) {
                val result = firstNumber + secondNumber
                binding.results.text = result.toString()
            } else {
println("Results not available")        }
        }
    }
}
