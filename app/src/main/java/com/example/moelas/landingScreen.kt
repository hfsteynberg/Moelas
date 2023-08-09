package com.example.moelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class landingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_screen)

        val categoryScreenNav = findViewById<Button>(R.id.button)
        categoryScreenNav.setOnClickListener{
            val Intent = Intent(this,categoryScreen::class.java)
            startActivity(Intent)
        }

    }
}