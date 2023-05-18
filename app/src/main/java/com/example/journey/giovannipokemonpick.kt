package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGiovannipokemonpickBinding

class giovannipokemonpick : AppCompatActivity() {
    private lateinit var binding: ActivityGiovannipokemonpickBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiovannipokemonpickBinding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)
        binding.megacharizardBtn.setOnClickListener {
            val intent = Intent(this@giovannipokemonpick,megacharizard_battle::class.java)
            startActivity(intent)
        }
        binding.megalucarioBtn.setOnClickListener {
            val intent1 = Intent(this@giovannipokemonpick, lucario_battle::class.java)
            startActivity(intent1)
        }
    }
}
