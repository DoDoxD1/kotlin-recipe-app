package com.techbonkers.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            kotlin.run {
                intent = Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }
            },3200)
    }
}