package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityTitleScreenBinding

class TitleScreen : AppCompatActivity() {
    private lateinit var binding: ActivityTitleScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTitleScreenBinding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener{
            val intent= Intent(this@TitleScreen, GameScreen::class.java)
            startActivity(intent)
        }

    }

}