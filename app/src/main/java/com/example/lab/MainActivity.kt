package com.example.lab

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.Spinner
import com.example.lab.lifecycle.Activity2

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private lateinit var editText1: EditText
    private lateinit var  button1: Button
    private lateinit var textView1: TextView
    private lateinit var spinner1: Spinner
    private lateinit var buttonActivity2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText1.text.clear()
        button1 = findViewById(R.id.button1)
        textView1 = findViewById(R.id.textView1)
        spinner1 = findViewById(R.id.spinner1)
        buttonActivity2 = findViewById(R.id.activity2)

        val adapter = ArrayAdapter.createFromResource(this, R.array.spinner, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner1.adapter = adapter
        spinner1.onItemSelectedListener = this

        buttonActivity2.setOnClickListener { openActivity2() }

    }

    private fun openActivity2() {
        Intent(this, Activity2::class.java).also { intent = it }
        startActivity(intent)
    }

    fun clicked(view: View) {

        if(view.id == R.id.button1) {
            textView1.text = editText1.text
            showPopUp(view, editText1.text.toString())
        }
    }

    private fun showPopUp(view: View, text: String) {
        val popup = PopUp(text)
        popup.show(supportFragmentManager, "dialog example")
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val selectedColour = parent?.getItemAtPosition(position).toString()
        Toast.makeText(this, selectedColour, Toast.LENGTH_SHORT).show()
        println(selectedColour)
//        <item>black</item>
//        <item>red</item>
//        <item>blue</item>
//        <item>green</item>
        when (selectedColour) {
            "black" -> {
                button1.setBackgroundColor(Color.BLACK)
            }
            "red" -> {
                button1.setBackgroundColor(Color.RED)
            }
            "blue" -> {
                button1.setBackgroundColor(Color.BLUE)
            }
            "green" -> {
                button1.setBackgroundColor(Color.GREEN) // should refactor dis...
            }
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}