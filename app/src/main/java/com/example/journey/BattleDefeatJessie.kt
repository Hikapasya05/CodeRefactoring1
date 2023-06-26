package com.example.journey

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.journey.databinding.ActivityBattleDefeatJessieBinding

class BattleDefeatJessie : AppCompatActivity() {
    private lateinit var binding: ActivityBattleDefeatJessieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBattleDefeatJessieBinding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)

        binding.continueFurtherBtnJessie.setOnClickListener {
            val intent = Intent(this@BattleDefeatJessie, GiovanniGlimpseScene::class.java)
            startActivity(intent)
        }



    }
}