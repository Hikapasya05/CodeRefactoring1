package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityJamesPokemonPickBinding

class JamesPokemonPick : AppCompatActivity() {
    private lateinit var binding: ActivityJamesPokemonPickBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJamesPokemonPickBinding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)

        binding.salamenceBtn.setOnClickListener {
            val intent = Intent(this@JamesPokemonPick, SalamenceBattle::class.java)
            startActivity(intent)
        }
        binding.megaswampertBtn.setOnClickListener {
            val intent1 = Intent(this@JamesPokemonPick, MegaSwampertBattle::class.java)
            startActivity(intent1)
        }
    }
}