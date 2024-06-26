package com.example.weatherapp

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

val exitButton=findViewById<Button>(R.id.button2)
exitButton.setOnClickListener { finishAffinity()


