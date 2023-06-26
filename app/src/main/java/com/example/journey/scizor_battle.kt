package com.example.journey

import android.content.Intent
import com.example.journey.databinding.ActivityCharizardBattleBinding
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.journey.databinding.ActivityScizorBattleBinding
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class scizor_battle : AppCompatActivity() {
    private lateinit var binding: ActivityScizorBattleBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScizorBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bewearHPscizor = binding.bewearHPscizor
        configureCircularProgressBar(bewearHPscizor)

        val scizorHP = binding.scizorHP
        configureCircularProgressBar(scizorHP)

        var progress = 100f
        binding.bulletpunchBtn.setOnClickListener {
            progress -= 25f
            battle(bewearHPscizor, progress)
            binding.bewearHPValuescizor.text = (progress.toInt()).toString()
        }
        binding.ironheadBtn.setOnClickListener {
            progress -= 25f
            battle(bewearHPscizor, progress)
            binding.bewearHPValuescizor.text = (progress.toInt()).toString()
        }
        binding.superpowerBtn.setOnClickListener {
            progress -= 25f
            battle(bewearHPscizor, progress)
            binding.bewearHPValuescizor.text = (progress.toInt()).toString()
        }



    }
    private fun battle(progressBar: CircularProgressBar, progress: Float) {
        if (progress == 0f) {
            Toast.makeText(this@scizor_battle, "Bewear fainted", Toast.LENGTH_SHORT).show()
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@scizor_battle, battle_defeat_jessie::class.java)
                startActivity(intent)
            }, 2000)
        }
        progressBar.setProgressWithAnimation(progress, 1000)
    }
}