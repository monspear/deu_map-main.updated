package com.example.project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class sanhak_floor4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sanhak_floor4)

        var checktime: TextView = findViewById(R.id.text_time34)
        var checkfloor: TextView = findViewById(R.id.text_floor34)

        checktime.text = intent.getStringExtra("time")
        checkfloor.text = intent.getStringExtra("floor")

        var time = intent.getStringExtra("time")
        var iv410: ImageView = findViewById(R.id.imageView410)
        var iv411:ImageView = findViewById(R.id.imageView411)
        var iv415:ImageView = findViewById(R.id.imageView415)
        var iv417:ImageView = findViewById(R.id.imageView417)
        var iv419:ImageView = findViewById(R.id.imageView419)

        if (time=="현재시각 : 09시 월요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 월요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 월요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 월요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 월요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 월요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 16시 월요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 목요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 목요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 금요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 금요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 금요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 금요일") iv410.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 16시 금요일") iv410.setImageResource(R.drawable.red)
        else iv410.setImageResource(R.drawable.green)

        if (time=="현재시각 : 10시 화요일") iv411.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 화요일") iv411.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 화요일") iv411.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 화요일") iv411.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 수요일") iv411.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 수요일") iv411.setImageResource(R.drawable.red)
        else iv411.setImageResource(R.drawable.green)

        if (time=="현재시각 : 12시 월요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 월요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 화요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 화요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 화요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 수요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 수요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 수요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 수요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 금요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 금요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 금요일") iv415.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 16시 금요일") iv415.setImageResource(R.drawable.red)
        else iv415.setImageResource(R.drawable.green)

        if (time=="현재시각 : 10시 월요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 월요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 월요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 월요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 화요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 화요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 화요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 수요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 수요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 수요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 수요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 수요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 목요일") iv417.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 금요일") iv417.setImageResource(R.drawable.red)
        else iv417.setImageResource(R.drawable.green)

        if (time=="현재시각 : 11시 화요일") iv419.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 화요일") iv419.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 화요일") iv419.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 목요일") iv419.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 목요일") iv419.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 금요일") iv419.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 금요일") iv419.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 금요일") iv419.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 금요일") iv419.setImageResource(R.drawable.red)
        else iv419.setImageResource(R.drawable.green)
    }
}