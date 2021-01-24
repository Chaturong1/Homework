package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = Number.text.toString().toInt()
        Add.setOnClickListener{
            if (number in 0..8){
                number += 1
                Number.setText(number.toString())
            }else{
                Toast.makeText(applicationContext, "ไม่สามารถเพิ่มค่าได้แล้ว", Toast.LENGTH_LONG).show()
            }
        }
        Minus.setOnClickListener{
            if (number in 1..9){
                number -= 1
                Number.setText(number.toString())
            }else{
                Toast.makeText(applicationContext, "ไม่สามารลดค่าได้แล้ว", Toast.LENGTH_LONG).show()
            }
        }
        Reset.setOnClickListener{
            number = 0
            Number.setText(number.toString())
        }

    }
}
