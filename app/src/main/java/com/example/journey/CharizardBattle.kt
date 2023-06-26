package com.example.journey

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.journey.databinding.ActivityCharizardBattleBinding


class CharizardBattle : AppCompatActivity() {
    private lateinit var binding: ActivityCharizardBattleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharizardBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configureCircularProgressBar(binding.bewearHP)
        configureCircularProgressBar(binding.charizardHP)

        setupButton(binding.fireblastBtn, "Fire Blast", binding.bewearHP, binding.bewearHPValue,this@CharizardBattle)
        setupButton(binding.dragontailBtn, "Dragon Tail", binding.bewearHP, binding.bewearHPValue, this@CharizardBattle)
        setupButton(binding.seismictossBtn, "Seismic Toss", binding.bewearHP, binding.bewearHPValue, this@CharizardBattle)
    }
}

