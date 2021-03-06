package com.wilfred.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        val increment: Button = findViewById(R.id.increment)
        val decrement: Button = findViewById(R.id.decrement)
        val txt: TextView = findViewById(R.id.number)
        val rst: ImageButton = findViewById(R.id.reset)

        rst.setOnClickListener{
            counter = 0
            txt.setText(counter.toString())
        }

        increment.setOnClickListener{
            counter++
            txt.setText(counter.toString())

        }

        decrement.setOnClickListener{
            counter--
            txt.setText(counter.toString())
        }
    }
}