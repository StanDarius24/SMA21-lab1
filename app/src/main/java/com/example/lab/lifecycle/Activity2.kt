package com.example.lab.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lab.MainActivity
import com.example.lab.R

class Activity2 : AppCompatActivity() {

    private lateinit var button2:Button
    private lateinit var button3:Button
    private lateinit var button4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        button2 = findViewById(R.id.button3)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)

        button2.setOnClickListener {
            Intent(this, Activity2::class.java).also { intent = it
                                                                     startActivity(intent)
                                                                    }
        }

        button3.setOnClickListener {openActivity3()}

        button4.setOnClickListener { openMainActivity() }
    }

    private fun openMainActivity() {
        Intent(this, MainActivity::class.java).also { intent = it }
        startActivity(intent)
    }

    private fun openActivity3() {
        Intent(this, Activity3::class.java).also { intent = it }
        startActivity(intent)
    }
}