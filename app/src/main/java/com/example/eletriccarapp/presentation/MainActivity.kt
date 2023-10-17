package com.example.eletriccarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import  android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.R
import com.example.eletriccarapp.presentation.adapter.CarAdapter

class MainActivity : AppCompatActivity() {

    lateinit var btnViewCalculate: Button
    lateinit var listCars: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
        setupList()
    }

    fun setupView() {
        btnViewCalculate = findViewById(R.id.btn_view_calculate)
        listCars = findViewById(R.id.list_cars)
    }

    fun setupList() {
        var datas = arrayOf(
            "Volkswagen Gol",
            "Fiat Argo",
            "Renault Kwid",
            "Chevrolet Onix",
            "Fiat Mobi",
        )
        val adapter = CarAdapter(datas)
        listCars.adapter = adapter
    }

    fun setupListeners() {
        btnViewCalculate.setOnClickListener {
            startActivity(Intent(this, CalculaterActivity::class.java ))
        }
    }
}