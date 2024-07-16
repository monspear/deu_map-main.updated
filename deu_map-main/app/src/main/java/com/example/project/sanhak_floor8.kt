package com.example.project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class sanhak_floor8 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sanhak_floor8)

        var checktime: TextView = findViewById(R.id.text_time38)
        var checkfloor: TextView = findViewById(R.id.text_floor38)

        checktime.text = intent.getStringExtra("time")
        checkfloor.text = intent.getStringExtra("floor")

        var time = intent.getStringExtra("time")
        var iv801: ImageView = findViewById(R.id.imageView801)
        var iv808: ImageView = findViewById(R.id.imageView808)
        var iv811: ImageView = findViewById(R.id.imageView811)
        var iv813: ImageView = findViewById(R.id.imageView813)
        var iv8141: ImageView = findViewById(R.id.imageView8141)

        if (time=="현재시각 : 11시 화요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 화요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 수요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 수요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 수요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 수요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 목요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 목요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 금요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 금요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 금요일") iv801.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 금요일") iv801.setImageResource(R.drawable.red)
        else iv801.setImageResource(R.drawable.green)

        if (time=="현재시각 : 13시 월요일") iv808.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 월요일") iv808.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 수요일") iv808.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 수요일") iv808.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 목요일") iv808.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 목요일") iv808.setImageResource(R.drawable.red)
        else iv808.setImageResource(R.drawable.green)

        if (time=="현재시각 : 13시 월요일") iv811.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 월요일") iv811.setImageResource(R.drawable.red)
        else iv811.setImageResource(R.drawable.green)

        if (time=="현재시각 : 12시 화요일") iv813.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 화요일") iv813.setImageResource(R.drawable.red)
        else iv813.setImageResource(R.drawable.green)

        if (time=="현재시각 : 15시 화요일") iv8141.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 16시 화요일") iv8141.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 수요일") iv8141.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 수요일") iv8141.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 목요일") iv8141.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 목요일") iv8141.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 금요일") iv8141.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 금요일") iv8141.setImageResource(R.drawable.red)
        else iv8141.setImageResource(R.drawable.green)
    }
}