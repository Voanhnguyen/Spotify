package com.example.spotifyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spotifyapp.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        //Hide Action Bar Programmatically
        supportActionBar?.hide()
    }
}