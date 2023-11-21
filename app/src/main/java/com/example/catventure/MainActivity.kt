package com.example.catventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_click: Button = findViewById(R.id.button_click)

        button_click.setOnClickListener() {
            val intent = Intent (this, HomePage::class.java)
            startActivity(intent)
        }
        }
    }

