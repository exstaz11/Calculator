package com.example.lb2calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        lateinit var tv3: TextView

        tv3 = findViewById(R.id.tv3)



        val number = intent.extras!!.getInt("RESULT")!!
        tv3.visibility = View.VISIBLE
        tv3.text = number.toString()
    }
}