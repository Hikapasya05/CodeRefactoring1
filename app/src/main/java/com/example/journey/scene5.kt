package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityScene5Binding


class scene5 : AppCompatActivity() {
    private lateinit var binding: ActivityScene5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScene5Binding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)
        val page = intent.getIntExtra(samepage.Page,0)
        showLayout(page)


        binding.battleJessieBtn.setOnClickListener{
            when(page){
                1 ->{
                    val intent = Intent(this@scene5,scene6::class.java)
                    startActivity(intent)
                }
                2 ->{
                    val intent = Intent(this@scene5, scene7::class.java)
                    startActivity(intent)
                }
            }
        }
    }
    private fun showLayout(page: Int){
        when (page) {
            1 -> {
                binding.jessiejamestalk.text = "'Hey kid, if you want to save piplup you have to battle me'"
                binding.youFoundJessie.text = "You found Jessie of Team Rocket !"
                binding.bewear1.setImageResource(R.drawable.bewear)
                binding.jessie1.setImageResource(R.drawable.jessie)


            }
            2 -> {
                binding.jessiejamestalk.text = "'Hey kiddo, you'll have to battle me to get Piplup'"
                binding.youFoundJessie.text = "You found James of Team Rocket !"
                binding.bewear1.setImageResource(R.drawable.yanmegaart)
                binding.jessie1.setImageResource(R.drawable.james)


            }
        }
    }
}




