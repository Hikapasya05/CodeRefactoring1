package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityBattleDefeatJamesBinding

class battle_defeat_james : AppCompatActivity() {
    private lateinit var binding: ActivityBattleDefeatJamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBattleDefeatJamesBinding.inflate(LayoutInflater.from(this),null, false)
        setContentView(binding.root)

        binding.continuefurtherBtnJessie.setOnClickListener {
            val intent = Intent(this@battle_defeat_james, giovanni_glimpse::class.java)
            startActivity(intent)
        }
    }
}