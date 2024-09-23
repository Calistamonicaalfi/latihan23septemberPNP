package com.coba.pnp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.coba.pnp.GaleriPhoto
import com.coba.pnp.R
import com.coba.pnp.model.ModelGaleri

class GaleriAdapter (private val getActivity: GaleriPhoto,
                     private  val galeriList :List<ModelGaleri>

) : RecyclerView.Adapter<GaleriAdapter.MyViewHolder>(){
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

        val txtGaleri : TextView = itemView.findViewById(R.id.txtGaleri)
        val imgGaleri : ImageView = itemView.findViewById(R.id.imgGaleri)
        val cardGaleri : CardView = itemView.findViewById(R.id.CardGaleri)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.image_galeri,parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return galeriList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtGaleri.text = galeriList[position].title
        holder.imgGaleri.setImageResource(galeriList[position].image)
        // supaya bisa di klik
        holder.cardGaleri.setOnClickListener(){

            Toast.makeText(getActivity,galeriList[position].title, Toast.LENGTH_SHORT).show()

        }
    }
}