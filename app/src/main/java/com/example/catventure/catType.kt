package com.example.catventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class catType : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_type)

        val buttonMaineCoon: Button = findViewById(R.id.buttonMaineCoon)

        buttonMaineCoon.setOnClickListener() {
            val intent = Intent (this, MaineCoon::class.java)
            startActivity(intent)
        }

        val buttonPersian: Button = findViewById(R.id.buttonPersian)

        buttonPersian.setOnClickListener() {
            val intent = Intent (this, Persian::class.java)
            startActivity(intent)
        }
        val buttonRagdoll: Button = findViewById(R.id.buttonRagdoll)

        buttonRagdoll.setOnClickListener() {
            val intent = Intent (this, Ragdoll::class.java)
            startActivity(intent)
        }
        val buttonSiamase: Button = findViewById(R.id.buttonSiamase)

        buttonSiamase.setOnClickListener() {
            val intent = Intent (this, Siamase::class.java)
            startActivity(intent)
        }
        val buttonAshorthair: Button = findViewById(R.id.buttonAshorthair)

        buttonAshorthair.setOnClickListener() {
            val intent = Intent (this, AmericanShorthair::class.java)
            startActivity(intent)
        }
        val buttonBengal: Button = findViewById(R.id.buttonBengal)

        buttonBengal.setOnClickListener() {
            val intent = Intent (this, Bengal::class.java)
            startActivity(intent)
        }
    }
}