package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityScene4Binding

class scene4 : AppCompatActivity() {
    private lateinit var binding: ActivityScene4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScene4Binding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)
        binding.btnGoUpTheStairway.setOnClickListener {
            val intent = Intent(this@scene4, scene5::class.java)

            intent.putExtra(samepage.Page,1)

            startActivity(intent)


        }
        binding.btnTurnright.setOnClickListener {
            val intent = Intent(this@scene4, scene5::class.java)

            intent.putExtra(samepage.Page,2)

            startActivity(intent)
        }

    }
}