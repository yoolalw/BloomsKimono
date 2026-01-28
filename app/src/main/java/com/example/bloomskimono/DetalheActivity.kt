package com.example.bloomskimono

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        val nomeKimono = intent.getStringExtra("kimonoNome")
        val imagemKimono = intent.getIntExtra("kimonoImagem", 0)

        val txtNome = findViewById<TextView>(R.id.txtKimonoNome)
        val imgKimono = findViewById<ImageView>(R.id.imgKimono)

        txtNome.text = nomeKimono
        imgKimono.setImageResource(imagemKimono)
    }
}
