package com.example.journey

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.journey.databinding.ActivityCharizardBattleBinding
import com.mikhaellopez.circularprogressbar.CircularProgressBar


class charizard_battle : AppCompatActivity() {
    private lateinit var binding: ActivityCharizardBattleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharizardBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bewearHP = binding.bewearHP
        bewearHP.apply {
            setProgressWithAnimation(100f, 2000)
            progressMax = 100f
            progressBarColor = Color.GREEN
            progressBarColorEnd = Color.GREEN
            progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM
            backgroundProgressBarColor = Color.GRAY
        }

        val charizardHP = binding.charizardHP
        charizardHP.apply {
            setProgressWithAnimation(100f,2000)
            progressMax = 100f
            progressBarColor = Color.GREEN
            progressBarColorEnd = Color.GREEN
            progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM
            backgroundProgressBarColor = Color.GRAY
        }

        var progress = 100f
        var currentValue: Int = binding.bewearHPValue.text.toString().toInt()
        binding.fireblastBtn.setOnClickListener {
            progress -= 25f
            battle(bewearHP, progress)
            binding.bewearHPValue.text = (progress.toInt()).toString()
        }
        binding.dragontailBtn.setOnClickListener {
            progress -= 25f
            battle(bewearHP, progress)
            binding.bewearHPValue.text = (progress.toInt()).toString()

        }
        binding.seismictossBtn.setOnClickListener {
            progress -= 25f
            battle(bewearHP, progress)
            binding.bewearHPValue.text = (progress.toInt()).toString()
        }



    }



    private fun battle(progressBar: CircularProgressBar, progress: Float) {
        if (progress == 0f) {
            Toast.makeText(this@charizard_battle, "Bewear fainted", Toast.LENGTH_SHORT).show()
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@charizard_battle, battle_defeat_jessie::class.java)
                startActivity(intent)
            }, 2000)
        }
        progressBar.setProgressWithAnimation(progress, 1000)
    }
}