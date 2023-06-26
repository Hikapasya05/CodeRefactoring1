package com.example.journey

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.journey.databinding.ActivityScizorBattleBinding

class ScizorBattle : AppCompatActivity() {
    private lateinit var binding: ActivityScizorBattleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScizorBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configureCircularProgressBar(binding.bewearHPscizor)
        configureCircularProgressBar(binding.scizorHP)

        setupButton(binding.bulletpunchBtn, "Bullet Punch", binding.bewearHPscizor, binding.bewearHPValuescizor, this@ScizorBattle)
        setupButton(binding.ironheadBtn, "Iron Head", binding.bewearHPscizor, binding.bewearHPValuescizor, this@ScizorBattle)
        setupButton(binding.superpowerBtn, "Superpower", binding.bewearHPscizor, binding.bewearHPValuescizor, this@ScizorBattle)
    }
}