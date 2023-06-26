package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityBattleDefeatJamesBinding

class BattleDefeatJames : AppCompatActivity() {
    private lateinit var binding: ActivityBattleDefeatJamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBattleDefeatJamesBinding.inflate(LayoutInflater.from(this),null, false)
        setContentView(binding.root)

        binding.continueFurtherBtnJessie.setOnClickListener {
            val intent = Intent(this@BattleDefeatJames, GiovanniGlimpseScene::class.java)
            startActivity(intent)
        }
    }
}