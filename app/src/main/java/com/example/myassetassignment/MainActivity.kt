package com.example.myassetassignment

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var music: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        music=MediaPlayer.create(applicationContext,R.raw.lojay)
        findViewById<Button>(R.id.playButton)
            .setOnClickListener { music.start() }

    }


}