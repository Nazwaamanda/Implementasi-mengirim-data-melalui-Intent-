package com.nazwa.intentexempele2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nazwa.intentexempele2.databinding.ActivityMainBinding // Pastikan ini sesuai dengan package Anda

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val sendData = binding.editText.text.toString()
            val intent = Intent(this@MainActivity,
                SecondActivity::class.java)
            intent.putExtra("main_activity_data", sendData)
            startActivity(intent)
        }
    }
}

