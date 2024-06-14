package com.example.filmlerapp.ui.fragment

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.example.filmlerapp.R
import com.example.filmlerapp.data.entitiy.Filmler
import com.example.filmlerapp.databinding.FragmentDetayBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding


//    companion object {
//        @JvmStatic
//        @BindingAdapter("android:src")
//        fun setImageViewResource(imageView: ImageView, resourceName: String) {
//            val context = imageView.context
//            val id = context.resources.getIdentifier(resourceName, "drawable", context.packageName)
//            imageView.setImageResource(id)
//        }
//    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detay, container, false)

        val bundle : DetayFragmentArgs by navArgs()
        val film = bundle.film

        // Data bindingdeki nesneye film nesnesini atama
        binding.filmlerNesnesi = film

        // dataBinding ile title verme
        binding.detayToolbarBaslik = film.film_ad

        // Glide ile resim yükleme
        val url = "http://kasimadalan.pe.hu/filmler_yeni/resimler/${film.film_resim}"
        Glide.with(this).load(url).override(500,750).into(binding.imageViewFilm)




        return binding.root
    }


}