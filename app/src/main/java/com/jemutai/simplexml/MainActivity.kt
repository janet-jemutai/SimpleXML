package com.jemutai.simplexml


import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.jemutai.simplexml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  val LOG_TAG = "UserInfo"

    private  lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnregister.setOnClickListener {
            val etfname = binding.etfname.editableText.toString()
            val  etlname = binding.etlname.editableText.toString()
            val  etemail = binding.etemail.editableText.toString()
            Log.d(LOG_TAG, "First Name: $etfname, Last Name: $etlname, Email: $etemail")


        }


    }
}