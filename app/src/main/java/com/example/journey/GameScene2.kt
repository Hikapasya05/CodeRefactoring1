package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGameScreen2Binding

class GameScene2 : AppCompatActivity() {
    private lateinit var binding: ActivityGameScreen2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGameScreen2Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        binding.btnTellhimyouarehappytoo.setOnClickListener{
            val intent = Intent(this@GameScene2, GameScene3::class.java)
            startActivity(intent)
        }

    }

}