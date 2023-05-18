package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityScene3Binding

class scene3 : AppCompatActivity() {
    private lateinit var binding: ActivityScene3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScene3Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.btnGototheforest.setOnClickListener{
            val intent = Intent(this@scene3, scene4::class.java)
            startActivity(intent)
        }
    }
}