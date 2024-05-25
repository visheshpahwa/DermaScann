package com.example.dermascan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreeen : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screeen)

        Handler().postDelayed({
            // Start the main activity after the splash delay
            val mainIntent = Intent(this@SplashScreeen, LoginActivity::class.java)
            startActivity(mainIntent)
            finish() // Close the splash activity to prevent going back
        }, SPLASH_DELAY)
    }
}