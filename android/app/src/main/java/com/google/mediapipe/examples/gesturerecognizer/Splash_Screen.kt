package com.google.mediapipe.examples.gesturerecognizer

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class Splash_Screen : AppCompatActivity() {

    private val SPLASH_TIME: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        // Delayed execution using Handler
        Handler(Looper.getMainLooper()).postDelayed({
            // Start MainActivity after SPLASH_TIME milliseconds
            val intent = Intent(this@Splash_Screen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME)
    }
}
