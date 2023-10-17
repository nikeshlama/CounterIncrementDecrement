package com.example.counterincrementdecrement.android

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var counterTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterTextView = findViewById(R.id.counterTextView)

        val incrementButton: Button = findViewById(R.id.incrementButton)
        incrementButton.setOnClickListener { incrementCounter() }

        val decrementButton: Button = findViewById(R.id.decrementButton)
        decrementButton.setOnClickListener { decrementCounter() }
    }

    private fun incrementCounter() {
        count++
        updateCounter()
    }

    private fun decrementCounter() {
        if (count > 0) {
            count--
            updateCounter()
        }
    }

    private fun updateCounter() {
        counterTextView.text = count.toString()
    }
}
