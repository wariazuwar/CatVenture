package com.example.catventure

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class Video1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video1)

       val videoView : VideoView = findViewById(R.id.xml_video_view)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setVideoPath("https://www.tiktok.com/search?lang=en&q=%23cat&t=1699814432441")
        videoView.start()
        videoView.setMediaController(mediaController)
    }
}