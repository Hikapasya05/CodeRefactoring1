package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGiovanniGlimpseBinding


class GiovanniGlimpseScene : AppCompatActivity() {
    private lateinit var binding: ActivityGiovanniGlimpseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiovanniGlimpseBinding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)

        binding.approachgiovanniBtn.setOnClickListener {
            val intent = Intent(this@GiovanniGlimpseScene, GiovanniTalk::class.java)
            startActivity(intent)
        }
    }
}