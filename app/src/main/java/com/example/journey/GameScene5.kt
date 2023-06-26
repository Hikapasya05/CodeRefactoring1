package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGameScene5Binding

class GameScene5 : AppCompatActivity() {
    private lateinit var binding: ActivityGameScene5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameScene5Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.btnGototheforest.setOnClickListener{
            val intent = Intent(this@GameScene5, GameScene6::class.java)
            startActivity(intent)
        }
    }
}