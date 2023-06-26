package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGiovannipokemonpickBinding

class GiovanniPokemonPick : AppCompatActivity() {
    private lateinit var binding: ActivityGiovannipokemonpickBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiovannipokemonpickBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.megacharizardBtn.setOnClickListener {
            val intent = Intent(this, MegaCharizardBattle::class.java)
            startActivity(intent)
        }

        binding.megalucarioBtn.setOnClickListener {
            val intent = Intent(this, LucarioBattle::class.java)
            startActivity(intent)
        }
    }
}
