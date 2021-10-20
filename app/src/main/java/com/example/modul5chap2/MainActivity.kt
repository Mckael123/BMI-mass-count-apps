package com.example.modul5chap2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        var tinggi : EditText  = findViewById(R.id.editTinggi)
        var berat  : EditText  = findViewById(R.id.editBerat)
        var submit : Button    = findViewById(R.id.btnNext)

        submit.setOnClickListener{
            val tinggi = tinggi.text.toString()
            val berat = berat.text.toString()
            var BMI = (berat.toDouble()/((tinggi.toDouble()/100)*(tinggi.toDouble()/100)))

            if(BMI<18){
                val moveWithDataIntent= Intent(this@MainActivity,result::class.java)
                moveWithDataIntent.putExtra(result.EXTRA_Type,"kurus")
                moveWithDataIntent.putExtra(result.EXTRA_count,BMI)
                startActivity(moveWithDataIntent)
            }
            else if(BMI>=18 && BMI <25){
                val moveWithDataIntent= Intent(this@MainActivity,result::class.java)
                moveWithDataIntent.putExtra(result.EXTRA_Type,"normal")
                moveWithDataIntent.putExtra(result.EXTRA_count,BMI)
                startActivity(moveWithDataIntent)
            }
            else{
                val moveWithDataIntent= Intent(this@MainActivity,result::class.java)
                moveWithDataIntent.putExtra(result.EXTRA_Type,"gendut")
                moveWithDataIntent.putExtra(result.EXTRA_count,BMI)
                startActivity(moveWithDataIntent)
            }
        }

    }
}