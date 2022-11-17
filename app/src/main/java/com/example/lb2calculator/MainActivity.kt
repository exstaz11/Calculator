package com.example.lb2calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    lateinit var text1 : EditText
    lateinit var text2: EditText
    lateinit var plus: Button
    lateinit var minus: Button
    lateinit var divide: Button
    lateinit var multiply: Button
    lateinit var clear: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)
        divide = findViewById(R.id.divide)
        multiply = findViewById(R.id.multiply)
        clear = findViewById(R.id.clear)






        plus.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val sum = text1.text.toString().toInt() + text2.text.toString().toInt()

            sum.toString()


            intent.putExtra("RESULT", sum)
            startActivity(intent)

        }

        minus.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val min = text1.text.toString().toInt() - text2.text.toString().toInt()

            min.toString()


            intent.putExtra("RESULT", min)
            startActivity(intent)
        }

        divide.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val div = text1.text.toString().toInt() / text2.text.toString().toInt()

            div.toString()


            intent.putExtra("RESULT", div)
            startActivity(intent)
        }

        multiply.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val mul = text1.text.toString().toInt() * text2.text.toString().toInt()

            mul.toString()


            intent.putExtra("RESULT", mul)
            startActivity(intent)
        }

        clear.setOnClickListener{
            val empty = ""
            text1.setText(empty)
            text2.setText(empty)

        }




    }



}