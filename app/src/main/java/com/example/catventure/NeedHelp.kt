package com.example.catventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NeedHelp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_need_help)

        val btnFirst: Button = findViewById(R.id.btnFirst)

        btnFirst.setOnClickListener() {
            val intent = Intent (this, catType::class.java)
            startActivity(intent)
        }
        val button6: Button = findViewById(R.id.button6)

        button6.setOnClickListener() {
            val intent = Intent(this, HealthCareRoutine::class.java)
            startActivity(intent)
        }
        val button7: Button = findViewById(R.id.button7)

        button7.setOnClickListener() {
            val intent = Intent(this, CatFMoment::class.java)
            startActivity(intent)
        }
    }
}