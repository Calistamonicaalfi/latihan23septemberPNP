package com.coba.pnp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.coba.pnp.adapter.GaleriAdapter
import com.coba.pnp.model.ModelGaleri

class GaleriPhoto : AppCompatActivity() {

    private var recyleView: RecyclerView? = null
    private var galeriAdapter: GaleriAdapter? = null
    private var galeriList =  mutableListOf<ModelGaleri>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galeri_photo)

        galeriList = ArrayList()
        recyleView = findViewById(R.id.rv_galeri)
        galeriAdapter = GaleriAdapter(this,galeriList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(
            this,2
        )
        recyleView!!.layoutManager = layoutManager
        recyleView!!.adapter = galeriAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        prepareGaleriList()
    }
    private fun prepareGaleriList()
    {
        var galeri = ModelGaleri("satu",R.drawable.satu)
        galeriList.add(galeri)
        galeri = ModelGaleri("dua",R.drawable.dua)
        galeriList.add(galeri)
        galeri = ModelGaleri("tiga",R.drawable.tiga)
        galeriList.add(galeri)
        galeri = ModelGaleri("empat",R.drawable.empat)
        galeriList.add(galeri)
        galeri = ModelGaleri("lima",R.drawable.lima)
        galeriList.add(galeri)
        galeri = ModelGaleri("enam",R.drawable.enam)
        galeriList.add(galeri)

        galeriAdapter!!.notifyDataSetChanged()
    }
}
