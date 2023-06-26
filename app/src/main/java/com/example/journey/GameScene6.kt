package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityGameScene6Binding

class GameScene6 : AppCompatActivity() {
    private lateinit var binding: ActivityGameScene6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameScene6Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)
        binding.btnGoUpTheStairway.setOnClickListener {
            val intent = Intent(this@GameScene6, BattleJessie::class.java)

            intent.putExtra(PageData.Page,1)

            startActivity(intent)


        }
        binding.btnTurnright.setOnClickListener {
            val intent = Intent(this@GameScene6, BattleJessie::class.java)

            intent.putExtra(PageData.Page,2)

            startActivity(intent)
        }

    }
}