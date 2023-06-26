package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityBattleJessieBinding


class BattleJessie : AppCompatActivity() {
    private lateinit var binding: ActivityBattleJessieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBattleJessieBinding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)
        val page = intent.getIntExtra(PageData.Page,0)
        showLayout(page)


        binding.battleJessieBtn.setOnClickListener{
            when(page){
                1 ->{
                    val intent = Intent(this@BattleJessie,JessiePokemonPick::class.java)
                    startActivity(intent)
                }
                2 ->{
                    val intent = Intent(this@BattleJessie, JamesPokemonPick::class.java)
                    startActivity(intent)
                }
            }
        }
    }
    private fun showLayout(page: Int){
        when (page) {
            1 -> {
                binding.jessieJamesTalk.text = "'Hey kid, if you want to save piplup you have to battle me'"
                binding.youFoundJessie.text = "You found Jessie of Team Rocket !"
                binding.bewear1.setImageResource(R.drawable.bewear)
                binding.jessie1.setImageResource(R.drawable.jessie)


            }
            2 -> {
                binding.jessieJamesTalk.text = "'Hey kiddo, you'll have to battle me to get Piplup'"
                binding.youFoundJessie.text = "You found James of Team Rocket !"
                binding.bewear1.setImageResource(R.drawable.yanmegaart)
                binding.jessie1.setImageResource(R.drawable.james)


            }
        }
    }
}




