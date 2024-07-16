package com.example.project

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class jungboActivity : AppCompatActivity() {
    private lateinit var btn_jungbo: Button
    private lateinit var btn_gonghak: Button
    private lateinit var btn_sanhak: Button
    private lateinit var btn_changeui: Button
    private lateinit var btn_jichun: Button

    @RequiresApi(Build.VERSION_CODES.O)
    fun timegenerator() :String{
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("현재시각 : HH시 ")
        val formatted = current.format(formatter)

        val ins = Calendar.getInstance()
        var dow = ins.get(Calendar.DAY_OF_WEEK).toString()

        if( dow == "1") {
            dow = "일요일"
        }
        else if(dow == "2") {
            dow = "월요일"
        }
        else if(dow == "3") {
            dow = "화요일"
        }
        else if(dow == "4") {
            dow = "수요일"
        }
        else if(dow == "5") {
            dow = "목요일"
        }
        else if(dow == "6") {
            dow = "금요일"
        }
        else if(dow == "7") {
            dow = "토요일"
        }
        return formatted + dow
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jungbo)

        var flag_time:String = "10"                       // 시간을 저장
        var flag_floor:String = "11"                      // 층을 저장


        flag_time = timegenerator()
        btn_sanhak = findViewById(R.id.button_sanhak)
        val sanhakFloor: Array<String> = arrayOf("1층","2층","3층", "4층", "5층", "6층", "7층", "8층") // 1,2층 강의실없음
        btn_sanhak.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(sanhakFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        flag_floor = (which+1).toString(); // 배열 주소(0부터시작) + 1 = 1~9층
                        flag_floor += "층"
                        if (flag_floor == "1층") {
                            val intent = Intent(this, sanhak_floor::class.java)
                            intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                            intent.putExtra("floor",flag_floor) // 이하동문
                            startActivity(intent)
                        }
                        else if (flag_floor == "2층") {
                            val intent = Intent(this, sanhak_floor2::class.java)
                            intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                            intent.putExtra("floor",flag_floor) // 이하동문
                            startActivity(intent)
                        }
                        else if (flag_floor == "3층") {
                            val intent = Intent(this, sanhak_floor3::class.java)
                            intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                            intent.putExtra("floor",flag_floor) // 이하동문
                            startActivity(intent)
                        }
                        else if (flag_floor == "4층") {
                            val intent = Intent(this, sanhak_floor4::class.java)
                            intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                            intent.putExtra("floor",flag_floor) // 이하동문
                            startActivity(intent)
                        }
                        else if (flag_floor == "5층") {
                            val intent = Intent(this, sanhak_floor5::class.java)
                            intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                            intent.putExtra("floor",flag_floor) // 이하동문
                            startActivity(intent)
                        }
                        else if (flag_floor == "6층") {
                            val intent = Intent(this, sanhak_floor6::class.java)
                            intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                            intent.putExtra("floor",flag_floor) // 이하동문
                            startActivity(intent)
                        }
                        else if (flag_floor == "7층") {
                            val intent = Intent(this, sanhak_floor7::class.java)
                            intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                            intent.putExtra("floor",flag_floor) // 이하동문
                            startActivity(intent)
                        }
                        else if (flag_floor == "8층") {
                            val intent = Intent(this, sanhak_floor8::class.java)
                            intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                            intent.putExtra("floor",flag_floor) // 이하동문
                            startActivity(intent)
                        }
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_jungbo = findViewById(R.id.button_jungbo)
        val jungboFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층","9층")
        btn_jungbo.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(jungboFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        flag_floor = (which+1).toString(); // 배열 주소(0부터시작) + 1 = 1~9층
                        flag_floor += "층"
                        val intent = Intent(this, jungbo_floor::class.java)
                        intent.putExtra("time",flag_time)   // time이라는 변수이름으로 flag_time 값 전달
                        intent.putExtra("floor",flag_floor) // 이하동문
                        startActivity(intent)

                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_gonghak = findViewById(R.id.button_gonghak)
        val gonghakFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층")
        btn_gonghak.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(gonghakFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        flag_floor = (which+1).toString(); // 배열 주소(0부터시작) + 1 = 1~9층
                        flag_floor += "층"
                        val intent = Intent(this, gonghak_floor::class.java)
                        intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                        intent.putExtra("floor",flag_floor) // 이하동문
                        startActivity(intent)
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_changeui = findViewById(R.id.button_changeui)
        val changeuiFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층")
        btn_changeui.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(changeuiFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        flag_floor = (which+1).toString(); // 배열 주소(0부터시작) + 1 = 1~9층
                        flag_floor += "층"
                        val intent = Intent(this, changeui_floor::class.java)
                        intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                        intent.putExtra("floor",flag_floor) // 이하동문
                        startActivity(intent)
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_jichun = findViewById(R.id.button_jichun)
        val jichunFloor: Array<String> = arrayOf("1층","2층", "3층", "4층","5층","6층") // 1,2,5층 강의실 없음
        btn_jichun.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(jichunFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        flag_floor = (which+1).toString(); // 배열 주소(0부터시작) + 1 = 1~9층
                        flag_floor += "층"
                        val intent = Intent(this, jichun_floor::class.java)
                        intent.putExtra("time",flag_time) // time이라는 변수이름으로 flag_time 값 전달
                        intent.putExtra("floor",flag_floor) // 이하동문
                        startActivity(intent)
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

    }
}