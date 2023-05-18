package com.example.journey

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import com.example.journey.databinding.ActivitySalamenceBattleBinding
import com.mikhaellopez.circularprogressbar.CircularProgressBar


class salamence_battle : AppCompatActivity() {
    private lateinit var binding: ActivitySalamenceBattleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySalamenceBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val yanmegaHPsalamence = binding.yanmegaHPsalamence
        yanmegaHPsalamence.apply {
            setProgressWithAnimation(100f,2000)
            progressMax = 100f
            progressBarColor = Color.GREEN
            progressBarColorEnd = Color.GREEN
            progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM
            backgroundProgressBarColor = Color.GRAY
        }

        val salamenceHP = binding.salamenceHP
        salamenceHP.apply {
            setProgressWithAnimation(100f,2000)
            progressMax = 100f
            progressBarColor = Color.GREEN
            progressBarColorEnd = Color.GREEN
            progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM
            backgroundProgressBarColor = Color.GRAY
        }

        var progress = 100f
        var currentValue: Int = binding.yanmegaHPValuesalamence.text.toString().toInt()
        binding.flamethrowerBtn.setOnClickListener {
            progress -= 25f
            battle(yanmegaHPsalamence, progress)
            binding.yanmegaHPValuesalamence.text = (progress.toInt()).toString()
        }
        binding.dragonrushBtn.setOnClickListener {
            progress -= 25f
            battle(yanmegaHPsalamence, progress)
            binding.yanmegaHPValuesalamence.text = (progress.toInt()).toString()
        }
        binding.stoneedgeBtn.setOnClickListener {
            progress -= 25f
            battle(yanmegaHPsalamence, progress)
            binding.yanmegaHPValuesalamence.text = (progress.toInt()).toString()
        }

    }
    private fun battle(progressBar: CircularProgressBar, progress: Float) {
        if (progress == 0f) {
            Toast.makeText(this@salamence_battle, "Yanmega fainted", Toast.LENGTH_SHORT).show()
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@salamence_battle, battle_defeat_james::class.java)
                startActivity(intent)
            }, 2000)
        }
        progressBar.setProgressWithAnimation(progress, 1000)
    }
}