package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityScene7Binding

class scene7 : AppCompatActivity() {
    private lateinit var binding: ActivityScene7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScene7Binding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)

        binding.salamenceBtn.setOnClickListener {
            val intent = Intent(this@scene7, salamence_battle::class.java)
            startActivity(intent)
        }
        binding.megaswampertBtn.setOnClickListener {
            val intent1 = Intent(this@scene7, megaswampert_battle::class.java)
            startActivity(intent1)
        }
    }
}