package com.developer.ping.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var tvDisplay: TextView? = null
    private var tvParameterX: TextView? = null
    private var tvParameterY: TextView? = null
    private var btnCalculator: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()
        initView()
    }

    private fun bindView() {
        tvDisplay = findViewById(R.id.tvDisplay)
        tvParameterX = findViewById(R.id.tvParameterX)
        tvParameterY = findViewById(R.id.tvParameterY)
        btnCalculator = findViewById(R.id.btnCalculator)
    }

    private fun initView() {
        btnCalculator?.setOnClickListener {
            val x = tvParameterX?.text.toString().toIntOrNull() ?: 0
            val y = tvParameterY?.text.toString().toIntOrNull() ?: 0

            tvDisplay?.text = (x + y).toString()
        }
    }
}