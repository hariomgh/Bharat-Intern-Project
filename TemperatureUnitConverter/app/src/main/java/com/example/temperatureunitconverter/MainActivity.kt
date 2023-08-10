package com.example.temperatureunitconverter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var b1: Button? = null
    var et: EditText? = null
    var tb: ToggleButton? = null
    var a: Double? = null
    var resultTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        et = findViewById<View>(R.id.editText) as EditText
        b1 = findViewById<View>(R.id.button) as Button
        tb = findViewById<View>(R.id.toggleButton) as ToggleButton
        resultTextView = findViewById<View>(R.id.resultTextView) as TextView

        b1!!.setOnClickListener {
            if (et!!.text.toString().isEmpty()) {
                Toast.makeText(
                    this@MainActivity,
                    "Please enter the temperature",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                a = et!!.text.toString().toDouble()
                val convertedTemperature: Double = if (tb!!.isChecked) {
                    a!! * 9 / 5 + 32
                } else {
                    (a!! - 32) * 5 / 9
                }
                val result = convertedTemperature.toString()
                resultTextView!!.text = if (tb!!.isChecked) {
                    "$result °F"
                } else {
                    "$result °C"
                }
            }
        }
    }
}