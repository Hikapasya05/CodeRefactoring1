package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityTalkGiovanniBinding

class talk_giovanni : AppCompatActivity() {
    private lateinit var binding: ActivityTalkGiovanniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTalkGiovanniBinding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)

        binding.battleGiovanniBtn.setOnClickListener {
            val intent = Intent(this@talk_giovanni, giovannipokemonpick::class.java)
            startActivity(intent)
        }
    }
}