package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGiovanniDefeatBinding

class giovanni_defeat : AppCompatActivity() {
    private lateinit var binding: ActivityGiovanniDefeatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiovanniDefeatBinding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.savePiplupBtn.setOnClickListener {
            val intent = Intent(this@giovanni_defeat,piplupsaved::class.java)
            startActivity(intent)
        }
    }
}