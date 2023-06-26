package com.example.journey

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.journey.databinding.ActivityLucarioBattleBinding
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class LucarioBattle : AppCompatActivity() {
    private lateinit var binding: ActivityLucarioBattleBinding
    private lateinit var lucarioHP: CircularProgressBar
    private lateinit var mewtwoHPlucario: CircularProgressBar
    private var progressMewtwo = 100f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLucarioBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lucarioHP = binding.lucarioHP
        configureCircularProgressBar(lucarioHP)

        mewtwoHPlucario = binding.mewtwoHPlucario
        configureCircularProgressBar(mewtwoHPlucario)

        binding.aurasphereBtn.setOnClickListener {
            executeAttack("Psycho cut.", 20f, lucarioHP, binding.lucarioHPValue,this, progressMewtwo)
            updateMewtwoHP(mewtwoHPlucario, binding.mewtwoHPValuelucario, this, progressMewtwo)
        }
        binding.extremespeedBtn.setOnClickListener {
            executeAttack("Hyper beam.", 20f, lucarioHP, binding.lucarioHPValue,this, progressMewtwo)
            updateMewtwoHP(mewtwoHPlucario, binding.mewtwoHPValuelucario, this, progressMewtwo)
        }
        binding.ragefistBtn.setOnClickListener {
            executeAttack("Psyshock.", 20f, lucarioHP, binding.lucarioHPValue,this, progressMewtwo)
            updateMewtwoHP(mewtwoHPlucario, binding.mewtwoHPValuelucario, this, progressMewtwo)
        }
    }

}