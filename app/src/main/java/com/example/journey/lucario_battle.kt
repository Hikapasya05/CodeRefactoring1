package com.example.journey

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.journey.databinding.ActivityLucarioBattleBinding
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class lucario_battle : AppCompatActivity() {
    private lateinit var binding: ActivityLucarioBattleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLucarioBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lucarioHP = binding.lucarioHP
        lucarioHP.apply {
            setProgressWithAnimation(100f,2000)
            progressMax = 100f
            progressBarColor = Color.GREEN
            progressBarColorEnd = Color.GREEN
            progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM
            backgroundProgressBarColor = Color.GRAY
        }
        val mewtwoHPlucario = binding.mewtwoHPlucario
        mewtwoHPlucario.apply {
            setProgressWithAnimation(100f,2000)
            progressMax = 100f
            progressBarColor = Color.GREEN
            progressBarColorEnd = Color.GREEN
            progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM
            backgroundProgressBarColor = Color.GRAY
        }

        var progressMewtwo = 100f
        var progressLucario = 100f
        var currentvalue: Int = binding.mewtwoHPValuelucario.text.toString().toInt()
        binding.aurasphereBtn.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                if(progressMewtwo >= 25) {
                    progressLucario -= 20f
                    binding.lucarioHPValue.text = (progressLucario.toInt()).toString()
                    battle(lucarioHP, progressLucario)
                    Toast.makeText(
                        this@lucario_battle,
                        "Mewtwo used Psycho cut.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }, 2000)

            progressMewtwo -=25f
            battle(mewtwoHPlucario, progressMewtwo)
            binding.mewtwoHPValuelucario.text = (progressMewtwo.toInt()).toString()
        }
        binding.extremespeedBtn.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                if(progressMewtwo >= 25) {
                    progressLucario -= 20f
                    binding.lucarioHPValue.text = (progressLucario.toInt()).toString()
                    battle(lucarioHP, progressLucario)

                    Toast.makeText(
                        this@lucario_battle,
                        "Mewtwo used Hyper beam.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }, 2000)

            progressMewtwo -=25f
            battle(mewtwoHPlucario, progressMewtwo)
            binding.mewtwoHPValuelucario.text = (progressMewtwo.toInt()).toString()
        }
        binding.ragefistBtn.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                if(progressMewtwo >= 25) {
                    progressLucario -= 20f
                    binding.lucarioHPValue.text = (progressLucario.toInt()).toString()
                    battle(lucarioHP, progressLucario)

                    Toast.makeText(
                        this@lucario_battle,
                        "Mewtwo used Psyshock.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }, 2000)

            progressMewtwo -=25f
            battle(mewtwoHPlucario, progressMewtwo)
            binding.mewtwoHPValuelucario.text = (progressMewtwo.toInt()).toString()
        }


    }
    private fun battle(progressBar: CircularProgressBar, progress: Float) {
        if (progress == 0f) {
            Toast.makeText(this@lucario_battle, "Mewtwo fainted", Toast.LENGTH_SHORT).show()
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@lucario_battle, giovanni_defeat::class.java)
                startActivity(intent)
            }, 2000)
        }
        progressBar.setProgressWithAnimation(progress, 2000)
    }

}