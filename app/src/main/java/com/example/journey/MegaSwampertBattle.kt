package com.example.journey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.journey.databinding.ActivityMegaswampertBattleBinding

class MegaSwampertBattle : AppCompatActivity() {
    private lateinit var binding: ActivityMegaswampertBattleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMegaswampertBattleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configureCircularProgressBar(binding.megaswampertHP)
        configureCircularProgressBar(binding.yanmegaHPmegaswampert)

        setupButton(binding.earthquakeBtn, "Earthquake", binding.yanmegaHPmegaswampert, binding.yanmegaHPValuemegaswampert, this@MegaSwampertBattle, this@MegaSwampertBattle)
        setupButton(binding.waterfallBtn,"Waterfall", binding.yanmegaHPmegaswampert, binding.yanmegaHPValuemegaswampert, this@MegaSwampertBattle, this@MegaSwampertBattle)
        setupButton(binding.icepunchBtn,"Ice Punch", binding.yanmegaHPmegaswampert, binding.yanmegaHPValuemegaswampert, this@MegaSwampertBattle, this@MegaSwampertBattle)
    //        var progress = 100f
//        binding.waterfallBtn.setOnClickListener {
//            progress -= 25f
//            battle(yanmegaHPmegaswampert, progress)
//            binding.yanmegaHPValuemegaswampert.text = (progress.toInt()).toString()
//        }
//        binding.earthquakeBtn.setOnClickListener {
//            progress -= 25f
//            battle(yanmegaHPmegaswampert, progress)
//            binding.yanmegaHPValuemegaswampert.text = (progress.toInt()).toString()
//        }
//        binding.icepunchBtn.setOnClickListener {
//            progress -= 25f
//            battle(yanmegaHPmegaswampert, progress)
//            binding.yanmegaHPValuemegaswampert.text = (progress.toInt()).toString()
//        }
//    }
//    private fun battle(progressBar: CircularProgressBar, progress: Float) {
//        if (progress == 0f) {
//            Toast.makeText(this@MegaSwampertBattle, "Yanmega fainted", Toast.LENGTH_SHORT).show()
//            Handler(Looper.getMainLooper()).postDelayed({
//                val intent = Intent(this@MegaSwampertBattle, BattleDefeatJames::class.java)
//                startActivity(intent)
//            }, 2000)
//        }
//        progressBar.setProgressWithAnimation(progress, 1000)
//    }
    }
}