package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.journey.databinding.ActivityGameScreen2Binding
import com.example.journey.databinding.ActivityGameScreenBinding

class GameScreen : AppCompatActivity() {
    private lateinit var binding: ActivityGameScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameScreenBinding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.btnGivehimfood.setOnClickListener{
            val intent = Intent(this@GameScreen, game_screen_2::class.java)
            startActivity(intent)
        }
        binding.btnPethim.setOnClickListener{
            val intent = Intent(this@GameScreen, game_screen_2::class.java)
            startActivity(intent)
        }
        binding.btnSayhi.setOnClickListener{
            val intent = Intent(this@GameScreen, game_screen_2::class.java)
            startActivity(intent)
        }
        binding.btnSmiletohim.setOnClickListener{
            val intent = Intent(this@GameScreen, game_screen_2::class.java)
            startActivity(intent)
        }
    }
}