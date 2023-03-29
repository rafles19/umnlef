package id.ac.umn.jam

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var clock: WaktuGame

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clockTextView = findViewById<TextView>(R.id.clock)
        clock = WaktuGame(clockTextView)
    }



    override fun onDestroy() {
        clock.stop()
        super.onDestroy()
    }
}





