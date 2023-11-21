package com.example.catventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HealthCareRoutine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health_care_routine)

        val button5: Button = findViewById(R.id.button5)

        button5.setOnClickListener() {
            val intent = Intent (this, BuildHealthyLifestyle::class.java)
            startActivity(intent)
        }
        val button9: Button = findViewById(R.id.button9)

        button9.setOnClickListener() {
            val intent = Intent (this, CatsBehaviour::class.java)
            startActivity(intent)
        }
    }
}