package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityScene2Binding

class scene2 : AppCompatActivity() {
    private lateinit var binding: ActivityScene2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScene2Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.btnReadit.setOnClickListener{
            val intent = Intent(this@scene2, scene3::class.java)
            startActivity(intent)
        }
    }
}