package id.ac.umn.jam

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class GameDashboard : AppCompatActivity() {
    private lateinit var clock: WaktuGame
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val inputText = intent.getStringExtra("EXTRA_TEXT")
        textView.text = inputText

        val clockTextView = findViewById<TextView>(R.id.clock)
         clock = WaktuGame(clockTextView)
    }

    override fun onDestroy() {
        clock.stop()
        super.onDestroy()
    }
}