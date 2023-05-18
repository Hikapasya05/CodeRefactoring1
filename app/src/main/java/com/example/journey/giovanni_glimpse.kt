package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGiovanniGlimpseBinding
import com.example.journey.databinding.ActivityLucarioBattleBinding

class giovanni_glimpse : AppCompatActivity() {
    private lateinit var binding: ActivityGiovanniGlimpseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiovanniGlimpseBinding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)

        binding.approachgiovanniBtn.setOnClickListener {
            val intent = Intent(this@giovanni_glimpse, talk_giovanni::class.java)
            startActivity(intent)
        }
    }
}