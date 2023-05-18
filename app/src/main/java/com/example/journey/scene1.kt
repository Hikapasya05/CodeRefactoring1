package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityScene1Binding

class scene1 : AppCompatActivity() {
    private lateinit var binding: ActivityScene1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScene1Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.btnWhathappened.setOnClickListener{
            val intent = Intent(this@scene1, scene2::class.java)
            startActivity(intent)
            }

        }
    }
