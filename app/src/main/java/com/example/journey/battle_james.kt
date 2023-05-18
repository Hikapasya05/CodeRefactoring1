package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityBattleJamesBinding


class battle_james : AppCompatActivity() {
    private lateinit var binding: ActivityBattleJamesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBattleJamesBinding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)

        binding.battleJamesBtn.setOnClickListener {
            val intent = Intent(this@battle_james, scene7::class.java)
            startActivity(intent)
        }

    }
}