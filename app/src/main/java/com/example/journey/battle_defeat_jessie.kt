package com.example.journey

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.journey.databinding.ActivityBattleDefeatJessieBinding

class battle_defeat_jessie : AppCompatActivity() {
    private lateinit var binding: ActivityBattleDefeatJessieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBattleDefeatJessieBinding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)

        binding.continuefurtherBtnJessie.setOnClickListener {
            val intent = Intent(this@battle_defeat_jessie, giovanni_glimpse::class.java)
            startActivity(intent)
        }



    }
}