package com.example.eletriccarapp.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccarapp.R

class CalculaterActivity: AppCompatActivity() {
    lateinit var preco: EditText
    lateinit var kmTraveled: EditText
    lateinit var btnCalculate: Button
    lateinit var value_result: TextView
    lateinit var btnClouse : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculater)
        setupView()
        setupListeners()
    }


    fun setupView() {
        preco = findViewById(R.id.edit_km_price)
        kmTraveled = findViewById(R.id.edit_km_traveled)
        btnCalculate = findViewById(R.id.btn_calculate)
        value_result = findViewById(R.id.value_result)
        btnClouse = findViewById(R.id.btn_close)
    }

    fun setupListeners() {
        btnCalculate.setOnClickListener {
           calculate()
        }
        btnClouse.setOnClickListener{
            finish()
        }
    }

    fun calculate() {
        val preco = preco.text.toString().toFloat()
        val km = kmTraveled.text.toString().toFloat()
        val results = preco / km

        value_result.text = results.toString()
    }
}