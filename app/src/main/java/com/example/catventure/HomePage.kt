package com.example.catventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val btn10: Button = findViewById(R.id.btn10)

        btn10.setOnClickListener() {
            val intent = Intent (this, catType::class.java)
            startActivity(intent)
        }
        val button2: Button = findViewById(R.id.button2)

        button2.setOnClickListener() {
            val intent = Intent (this, HealthCareRoutine::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)

        button3.setOnClickListener() {
            val intent = Intent(this, CatFMoment::class.java)
            startActivity(intent)

            val button: Button = findViewById(R.id.button)

            button.setOnClickListener() {
                val intent = Intent(this, NeedHelp::class.java)
                startActivity(intent)
            }

        }
    }
}