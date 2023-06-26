package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGameScene4Binding

class GameScene4 : AppCompatActivity() {
    private lateinit var binding: ActivityGameScene4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameScene4Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.btnReadit.setOnClickListener{
            val intent = Intent(this@GameScene4, GameScene5::class.java)
            startActivity(intent)
        }
    }
}