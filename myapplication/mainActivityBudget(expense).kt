package com.example.budgettracker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class budgettracker : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Optional: Add logic for buttons, etc.
        val chartsButton = findViewById<Button>(R.id.chartsButton)
        chartsButton?.setOnClickListener {
            Toast.makeText(this, "Charts coming soon!", Toast.LENGTH_SHORT).show()
        }
    }
}