package com.coba.pnp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var  btnMI : Button
    private lateinit var  btnTK : Button
    private lateinit var  btnGaleri : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMI = findViewById(R.id.btnMi)
        btnTK = findViewById(R.id. btnTk)
        btnGaleri = findViewById(R.id.btnGr)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnMI.setOnClickListener(){
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(this@MainActivity,
                Manajemen_Informatika::class.java)
            startActivity(intentMenu2)
        }
        btnTK.setOnClickListener(){
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(this@MainActivity,
                Teknik_Komputer::class.java)
            startActivity(intentMenu2)
        }

        btnGaleri.setOnClickListener(){
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(this@MainActivity,
                GaleriPhoto::class.java)
            startActivity(intentMenu2)
        }
    }
}
