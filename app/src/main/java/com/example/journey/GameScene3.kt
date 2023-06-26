package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGameScene3Binding

class GameScene3 : AppCompatActivity() {
    private lateinit var binding: ActivityGameScene3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameScene3Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.btnWhathappened.setOnClickListener{
            val intent = Intent(this@GameScene3, GameScene4::class.java)
            startActivity(intent)
            }

        }
    }
