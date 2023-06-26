package com.example.journey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.journey.databinding.ActivityMegacharizardBattleBinding
import com.mikhaellopez.circularprogressbar.CircularProgressBar


class MegaCharizardBattle : AppCompatActivity() {
    private lateinit var binding: ActivityMegacharizardBattleBinding
    private lateinit var megacharizardHP: CircularProgressBar
    private lateinit var mewtwoHPmegacharizard: CircularProgressBar
    private var progressMewtwo = 100f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMegacharizardBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        megacharizardHP = binding.megacharizardHP
        configureCircularProgressBar(megacharizardHP)

        mewtwoHPmegacharizard = binding.mewtwoHPmegacharizard
        configureCircularProgressBar(mewtwoHPmegacharizard)

        binding.firespinBtn.setOnClickListener {
            executeAttack("Hyper beam.", 20f, megacharizardHP, binding.megacharizardHPValue, this, progressMewtwo)
            updateMewtwoHP(mewtwoHPmegacharizard, binding.mewtwoHPValuemegacharizard, this,progressMewtwo)
        }
        binding.blastburnBtn.setOnClickListener {
            executeAttack("Psycho cut.", 20f, megacharizardHP, binding.megacharizardHPValue, this, progressMewtwo)
            updateMewtwoHP(mewtwoHPmegacharizard, binding.mewtwoHPValuemegacharizard, this, progressMewtwo)
        }
        binding.flareblitzBtn.setOnClickListener {
            executeAttack("Psyshock.", 20f, megacharizardHP, binding.megacharizardHPValue, this, progressMewtwo)
            updateMewtwoHP(mewtwoHPmegacharizard, binding.mewtwoHPValuemegacharizard, this, progressMewtwo)
        }
    }
    }



