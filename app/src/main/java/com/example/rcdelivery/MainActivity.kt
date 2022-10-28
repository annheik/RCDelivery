package com.example.rcdelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        val recallButton : Button = findViewById(R.id.recallButton)

        recallButton.setOnClickListener {
            Toast.makeText(this, "RC Recalled!", Toast.LENGTH_SHORT).show()
        }
    }
}