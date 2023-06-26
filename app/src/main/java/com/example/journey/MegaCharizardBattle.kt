package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.journey.databinding.ActivityMegacharizardBattleBinding
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class MegaCharizardBattle : AppCompatActivity() {
    private lateinit var binding: ActivityMegacharizardBattleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMegacharizardBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val megacharizardHP = binding.megacharizardHP
        configureCircularProgressBar(megacharizardHP)

        val mewtwoHPmegacharizard = binding.mewtwoHPmegacharizard
        configureCircularProgressBar(mewtwoHPmegacharizard)

        var progressMewtwo = 100f
        var progressMegacharizard = 100f
        var currentvalue: Int = binding.mewtwoHPValuemegacharizard.text.toString().toInt()
        binding.firespinBtn.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                if (progressMewtwo >= 25) {
                    progressMegacharizard -= 20f
                    binding.megacharizardHPValue.text = (progressMegacharizard.toInt()).toString()
                    battle(megacharizardHP, progressMegacharizard)
                    Toast.makeText(
                        this@MegaCharizardBattle,
                        "Mewtwo used Hyper beam.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }, 2000)

            progressMewtwo -= 25f
            battle(mewtwoHPmegacharizard, progressMewtwo)
            binding.mewtwoHPValuemegacharizard.text = (progressMewtwo.toInt()).toString()
        }
        binding.blastburnBtn.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                if (progressMewtwo >= 25) {
                    progressMegacharizard -= 20f
                    binding.megacharizardHPValue.text = (progressMegacharizard.toInt()).toString()
                    battle(megacharizardHP, progressMegacharizard)

                    Toast.makeText(
                        this@MegaCharizardBattle,
                        "Mewtwo used Psycho cut.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }, 2000)

            progressMewtwo -= 25f
            battle(mewtwoHPmegacharizard, progressMewtwo)
            binding.mewtwoHPValuemegacharizard.text = (progressMewtwo.toInt()).toString()
        }
        binding.flareblitzBtn.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                if (progressMewtwo >= 25) {
                    progressMegacharizard -= 20f
                    binding.megacharizardHPValue.text = (progressMegacharizard.toInt()).toString()
                    battle(megacharizardHP, progressMegacharizard)
                    Toast.makeText(
                        this@MegaCharizardBattle,
                        "Mewtwo used Psyshock.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }, 2000)

            progressMewtwo -= 25f
            battle(mewtwoHPmegacharizard, progressMewtwo)
            binding.mewtwoHPValuemegacharizard.text = (progressMewtwo.toInt()).toString()
        }
    }
    private fun battle(progressBar: CircularProgressBar, progress: Float){
        if (progress ==0f){
            Toast.makeText(this@MegaCharizardBattle, "Mewtwo fainted", Toast.LENGTH_SHORT).show()
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@MegaCharizardBattle, GiovanniDefeatScene::class.java)
                startActivity(intent)
            }, 2000)
        }
        progressBar.setProgressWithAnimation(progress, 2000)
    }


}