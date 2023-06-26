package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityJessiePokemonPickBinding

class JessiePokemonPick : AppCompatActivity() {
    private lateinit var binding: ActivityJessiePokemonPickBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJessiePokemonPickBinding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)
        binding.charizardBtn.setOnClickListener {
            val intent = Intent(this@JessiePokemonPick, CharizardBattle::class.java)

            startActivity(intent)
        }
        binding.scizorBtn.setOnClickListener {
            val intent1 = Intent(this@JessiePokemonPick, ScizorBattle::class.java)

            startActivity(intent1)
            }

        }
    }