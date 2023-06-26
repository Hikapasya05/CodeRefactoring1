package com.example.journey

import android.graphics.Color
import com.mikhaellopez.circularprogressbar.CircularProgressBar

fun configureCircularProgressBar(progressBar: CircularProgressBar) {
    progressBar.apply {
        setProgressWithAnimation(100f, 2000)
        progressMax = 100f
        progressBarColor = Color.GREEN
        progressBarColorEnd = Color.GREEN
        progressBarColorDirection = CircularProgressBar.GradientDirection.TOP_TO_BOTTOM
        backgroundProgressBarColor = Color.GRAY
    }
}