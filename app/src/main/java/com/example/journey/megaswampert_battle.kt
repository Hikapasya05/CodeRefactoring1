package com.example.journey

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.journey.databinding.ActivityMegaswampertBattleBinding
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class megaswampert_battle : AppCompatActivity() {
    private lateinit var binding: ActivityMegaswampertBattleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMegaswampertBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val yanmegaHPmegaswampert = binding.yanmegaHPmegaswampert
        yanmegaHPmegaswampert.apply {
            setProgressWithAnimation(100f,2000)
            progressMax = 100f
            progressBarColor = Color.GREEN
            progressBarColorEnd = Color.GREEN
            progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM
            backgroundProgressBarColor = Color.GRAY
        }
        val megaswampertHP = binding.megaswampertHP
        megaswampertHP.apply {
            setProgressWithAnimation(100f,2000)
            progressMax = 100f
            progressBarColor = Color.GREEN
            progressBarColorEnd = Color.GREEN
            progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM
            backgroundProgressBarColor = Color.GRAY
        }

        var progress = 100f
        var currentValue: Int = binding.yanmegaHPValuemegaswampert.text.toString().toInt()
        binding.waterfallBtn.setOnClickListener {
            progress -= 25f
            battle(yanmegaHPmegaswampert, progress)
            binding.yanmegaHPValuemegaswampert.text = (progress.toInt()).toString()
        }
        binding.earthquakeBtn.setOnClickListener {
            progress -= 25f
            battle(yanmegaHPmegaswampert, progress)
            binding.yanmegaHPValuemegaswampert.text = (progress.toInt()).toString()
        }
        binding.icepunchBtn.setOnClickListener {
            progress -= 25f
            battle(yanmegaHPmegaswampert, progress)
            binding.yanmegaHPValuemegaswampert.text = (progress.toInt()).toString()
        }
    }
    private fun battle(progressBar: CircularProgressBar, progress: Float) {
        if (progress == 0f) {
            Toast.makeText(this@megaswampert_battle, "Yanmega fainted", Toast.LENGTH_SHORT).show()
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@megaswampert_battle, battle_defeat_james::class.java)
                startActivity(intent)
            }, 2000)
        }
        progressBar.setProgressWithAnimation(progress, 1000)
    }
}