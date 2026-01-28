package com.example.bloomskimono

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->

            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val kimono1 = findViewById<ImageButton>(R.id.kimono1)
        val kimono2 = findViewById<ImageButton>(R.id.kimono2)
        val kimono3 = findViewById<ImageButton>(R.id.kimono3)
        val kimono4 = findViewById<ImageButton>(R.id.kimono4)

        kimono1.setOnClickListener {
            val intent = Intent(this@MainActivity, DetalheActivity::class.java)
            intent.putExtra("kimonoNome", "Kimono Rosa Tradicional")
            intent.putExtra("kimonoImagem", R.drawable._92aff8ab6df34b17444c1871b06aefe)
            startActivity(intent)
        }

        kimono2.setOnClickListener {
            val intent = Intent(this@MainActivity, DetalheActivity::class.java)
            intent.putExtra("kimonoNome", "Kimono Azul Clássico")
            intent.putExtra("kimonoImagem", R.drawable._879a145d580556d14991fb16d27fc59)
            startActivity(intent)
        }

        kimono3.setOnClickListener {
            val intent = Intent(this@MainActivity, DetalheActivity::class.java)
            intent.putExtra("kimonoNome", "Kimono Roxo Elegante")
            intent.putExtra("kimonoImagem", R.drawable._d6edbac6aa412b516779388f8fd72d1)
            startActivity(intent)
        }

        kimono4.setOnClickListener {
            val intent = Intent(this@MainActivity, DetalheActivity::class.java)
            intent.putExtra("kimonoNome", "Kimono Dourado Real")
            intent.putExtra("kimonoImagem", R.drawable._4b992afae479b5145275060442328ec)
            startActivity(intent)
        }

        }
    }