package com.example.journey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.journey.databinding.ActivitySalamenceBattleBinding



class SalamenceBattle : AppCompatActivity() {
    private lateinit var binding: ActivitySalamenceBattleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySalamenceBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configureCircularProgressBar(binding.salamenceHP)
        configureCircularProgressBar(binding.yanmegaHPsalamence)

        setupButton(binding.dragonrushBtn, "Dragon Rush", binding.yanmegaHPsalamence, binding.yanmegaHPValuesalamence, this@SalamenceBattle, this@SalamenceBattle)
        setupButton(binding.flamethrowerBtn, "Flamethrower", binding.yanmegaHPsalamence, binding.yanmegaHPValuesalamence, this@SalamenceBattle, this@SalamenceBattle)
        setupButton(binding.stoneedgeBtn, "Stone Edge", binding.yanmegaHPsalamence, binding.yanmegaHPValuesalamence, this@SalamenceBattle,this@SalamenceBattle)
    }
    }