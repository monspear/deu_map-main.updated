package com.example.project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class sanhak_floor5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sanhak_floor5)

        var checktime: TextView = findViewById(R.id.text_time35)
        var checkfloor: TextView = findViewById(R.id.text_floor35)

        checktime.text = intent.getStringExtra("time")
        checkfloor.text = intent.getStringExtra("floor")

        var time = intent.getStringExtra("time")
        var iv510: ImageView = findViewById(R.id.imageView510)
        var iv522: ImageView = findViewById(R.id.imageView522)

        if (time=="현재시각 : 09시 화요일") iv510.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 화요일") iv510.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 화요일") iv510.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 화요일") iv510.setImageResource(R.drawable.red)
        else iv510.setImageResource(R.drawable.green)

        if (time=="현재시각 : 09시 월요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 월요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 월요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 화요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 화요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 화요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 수요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 수요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 수요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 수요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 목요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 금요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 금요일") iv522.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 금요일") iv522.setImageResource(R.drawable.red)
        else iv522.setImageResource(R.drawable.green)
    }
}