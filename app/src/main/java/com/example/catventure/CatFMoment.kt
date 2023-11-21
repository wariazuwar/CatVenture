package com.example.catventure

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class CatFMoment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_fmoment)

        val link : TextView = findViewById(R.id.textView32)

        link.movementMethod = LinkMovementMethod.getInstance()
        link.setLinkTextColor(Color.BLUE)

        val link2 : TextView = findViewById(R.id.textView37)

        link2.movementMethod = LinkMovementMethod.getInstance()
        link.setLinkTextColor(Color.BLUE)

        val link3 : TextView = findViewById(R.id.textView38)

        link3.movementMethod = LinkMovementMethod.getInstance()
        link.setLinkTextColor(Color.BLUE)


    }
}