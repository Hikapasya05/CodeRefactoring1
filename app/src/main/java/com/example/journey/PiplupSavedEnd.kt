package com.example.journey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.journey.databinding.ActivityPiplupsavedBinding

class PiplupSavedEnd : AppCompatActivity() {
    private lateinit var binding: ActivityPiplupsavedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPiplupsavedBinding.inflate(LayoutInflater.from(this),null, false)
        setContentView(binding.root)

        binding.goHomeBtn.setOnClickListener {
            val intent = Intent(this@PiplupSavedEnd, TitleScreen::class.java)
            startActivity(intent)
        }
    }
}