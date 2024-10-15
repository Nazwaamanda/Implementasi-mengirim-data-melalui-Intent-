package com.nazwa.intentexempele2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nazwa.intentexempele2.databinding.ActivitySecondBinding // Pastikan ini sesuai dengan package Anda

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi binding
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menerima data dari MainActivity
        val receiveData = intent.getStringExtra("main_activity_data")

        // Validasi apakah data tidak null, lalu menampilkannya
        if (!receiveData.isNullOrEmpty()) {
            binding.textView.text = receiveData
        } else {
            binding.textView.text = "No data received"
        }
    }
}
