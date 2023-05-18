package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityScene6Binding

class scene6 : AppCompatActivity() {
    private lateinit var binding: ActivityScene6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScene6Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)
        binding.charizardBtn.setOnClickListener {
            val intent = Intent(this@scene6, charizard_battle::class.java)

            startActivity(intent)
        }
        binding.scizorBtn.setOnClickListener {
            val intent1 = Intent(this@scene6, scizor_battle::class.java)

            startActivity(intent1)
            }

        }
    }