package com.example.project

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class sanhak_floor3 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sanhak_floor3)

        var checktime: TextView = findViewById(R.id.text_time33)
        var checkfloor: TextView = findViewById(R.id.text_floor33)

        checktime.text = intent.getStringExtra("time")
        checkfloor.text = intent.getStringExtra("floor")

        var time = intent.getStringExtra("time")
        var iv314:ImageView = findViewById(R.id.imageView314)

        if (time=="현재시각 : 14시 목요일") iv314.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 목요일") iv314.setImageResource(R.drawable.red)
        else iv314.setImageResource(R.drawable.green)
    }
}