package com.example.modul5chap2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class result : AppCompatActivity() {
    companion object{
        const val EXTRA_Type="extra_type"
        const val EXTRA_count="extra_count"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_result)
        var score: TextView = findViewById(R.id.score)
        val type : TextView = findViewById(R.id.tipe)
        val typeresult = intent.getStringExtra(EXTRA_Type)
        val countresult = intent.getDoubleExtra(EXTRA_count,0.0)

        type.text=typeresult
        score.text= countresult.toString()
    }
}