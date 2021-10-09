package com.example.lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var  button1: Button
    private lateinit var textView1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1= findViewById(R.id.editText1)
        editText1.text.clear()
        button1 = findViewById(R.id.button1)
        textView1= findViewById(R.id.textView1)

    }

    fun clicked(view: View) {

        if(view.id == R.id.button1) {
            println("it s here")
            println(editText1.text)
            textView1.setText(editText1.text)
        }
    }
}