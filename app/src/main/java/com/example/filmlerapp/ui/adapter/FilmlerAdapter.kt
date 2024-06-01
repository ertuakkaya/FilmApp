package com.example.filmlerapp.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.filmlerapp.R
import com.example.filmlerapp.data.entitiy.Filmler
import com.example.filmlerapp.databinding.CardTasarimBinding
import com.example.filmlerapp.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(var mContext : Context, var filmlerList : List<Filmler>) : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>(){


    inner class CardTasarimTutucu(var tasarim : CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding : CardTasarimBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.card_tasarim, parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerList.get(position) // position ile listedeki her bir elemana ulaşırız
        val t = holder.tasarim

        t.imageViewFilmCard.setImageResource(
            mContext.resources.getIdentifier(film.resim, "drawable", mContext.packageName)
        )

        // DataBinding ile nesne atama
        t.filmNesnesi = film


        t.buttonSepet.setOnClickListener(){
            Snackbar.make(t.root, "${film.ad} sepete eklendi", Snackbar.LENGTH_SHORT)


                .show()
        }

        t.cardViewFilm.setOnClickListener(){
            val gecis = AnasayfaFragmentDirections.detayGecis(film)
            Navigation.findNavController(it).navigate(gecis)
            Log.e("Gecis", "Gecis yapıldı ${gecis}")
        }



    }




    override fun getItemCount(): Int {
       return filmlerList.size
    }


}