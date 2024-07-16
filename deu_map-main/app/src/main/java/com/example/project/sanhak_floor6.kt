package com.example.project

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class sanhak_floor6 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sanhak_floor6)

        var checktime: TextView = findViewById(R.id.text_time36)
        var checkfloor: TextView = findViewById(R.id.text_floor36)

        checktime.text = intent.getStringExtra("time")
        checkfloor.text = intent.getStringExtra("floor")

        var time = intent.getStringExtra("time")
        var iv618: ImageView = findViewById(R.id.imageView618)
        var iv620: ImageView = findViewById(R.id.imageView620)
        var iv622: ImageView = findViewById(R.id.imageView622)
        var iv623: ImageView = findViewById(R.id.imageView623)

        if (time=="현재시각 : 09시 월요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 월요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 화요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 화요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 화요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 수요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 수요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 수요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 수요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 금요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 금요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 금요일") iv618.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 금요일") iv618.setImageResource(R.drawable.red)
        else iv618.setImageResource(R.drawable.green)

        if (time=="현재시각 : 11시 월요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 월요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 월요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 월요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 수요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 수요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 수요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 수요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 수요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 수요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 수요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 16시 수요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 목요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 목요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 목요일") iv620.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 16시 목요일") iv620.setImageResource(R.drawable.red)
        else iv620.setImageResource(R.drawable.green)

        if (time=="현재시각 : 09시 월요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 월요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 월요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 월요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 월요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 화요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 화요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 화요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 화요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 화요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 수요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 수요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 목요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 목요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 목요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 금요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 금요일") iv622.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 16시 금요일") iv622.setImageResource(R.drawable.red)
        else iv622.setImageResource(R.drawable.green)

        if (time=="현재시각 : 10시 월요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 월요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 12시 수요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 15시 수요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 16시 수요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 목요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 11시 목요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 목요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 목요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 09시 금요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 10시 금요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 13시 금요일") iv623.setImageResource(R.drawable.red)
        else if (time=="현재시각 : 14시 금요일") iv623.setImageResource(R.drawable.red)
        else iv623.setImageResource(R.drawable.green)
    }
}