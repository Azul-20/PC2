package com.rael.rivero.PC2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class Pregunta01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta01)

        val imgView = findViewById<ImageView>(R.id.imgView)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val btnOcultar = findViewById<Button>(R.id.btnOcultar)

        btnMostrar.setOnClickListener{
            imgView.visibility = View.VISIBLE
        }

        btnOcultar.setOnClickListener {
            imgView.visibility = View.GONE
        }
    }
}