package com.example.journey

import android.content.Intent
import android.graphics.Color
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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

fun battle(progressBar: CircularProgressBar, progress: Float) {
    progressBar.setProgressWithAnimation(progress, 2000)
}
fun updateMewtwoHP(
    progressBar: CircularProgressBar,
    textView: TextView,
    activity: AppCompatActivity,
    progressMewtwo: Float) {
    var progressMewtwo = progressBar.progress
    progressMewtwo -= 25f
    progressBar.progress = progressMewtwo.toInt().toFloat()
    textView.text = progressMewtwo.toInt().toString()

    if (progressMewtwo <= 0f) {
        val toastMessage = when (activity) {
            is LucarioBattle -> "Mewtwo fainted"
            is MegaCharizardBattle -> "Mewtwo fainted"
            else -> "Mewtwo fainted"
        }
        Toast.makeText(activity.applicationContext, toastMessage, Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(activity, GiovanniDefeatScene::class.java)
            activity.startActivity(intent)
        }, 2000)
    }
}
fun executeAttack(
    moveName: String,
    damage: Float,
    progressBar: CircularProgressBar,
    textView: TextView,
    activity: AppCompatActivity,
    progressMewtwo: Float
) {
    val progress = progressBar.progress
    if (progress >= 25 && progressMewtwo > 0) {
        val newProgress = progress - damage
        textView.text = newProgress.toInt().toString()
        battle(progressBar, newProgress)
        Toast.makeText(activity.applicationContext, "Mewtwo used $moveName", Toast.LENGTH_SHORT).show()

    }
}

 fun defeatJessie(activity: AppCompatActivity) {
    val toastMessage = "Bewear fainted"
    Toast.makeText(activity, toastMessage, Toast.LENGTH_SHORT).show()
    Handler(Looper.getMainLooper()).postDelayed({
        val intent = Intent(activity, BattleDefeatJessie::class.java)
        activity.startActivity(intent)
    }, 2000)
}
var progress = 100f
fun setupButton(
    button: Button,
    moveName: String,
    progressBar: CircularProgressBar,
    textView: TextView,
    firstActivity: AppCompatActivity,
    secondActivity: AppCompatActivity? = null
) {
    button.setOnClickListener {
        progress -= 25f
        battle(progressBar, progress)
        textView.text = progress.toInt().toString()
        if (progress == 0f) {
            defeatJessie(firstActivity)
            secondActivity?.let { defeatJames(it) }
        }
        }
    }


fun defeatJames(activity: AppCompatActivity) {
    val toastMessage = "Yanmega fainted"
    Toast.makeText(activity, toastMessage, Toast.LENGTH_SHORT).show()
    Handler(Looper.getMainLooper()).postDelayed({
        val intent = Intent(activity, BattleDefeatJames::class.java)
        activity.startActivity(intent)
    }, 2000)
}











