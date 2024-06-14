package com.example.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.filmlerapp.R
import com.example.filmlerapp.data.entitiy.Filmler
import com.example.filmlerapp.databinding.FragmentAnasayfaBinding
import com.example.filmlerapp.ui.adapter.FilmlerAdapter
import com.example.filmlerapp.ui.viewmodel.AnasayfaViewModel
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding


    // viewmodel'i baglamak için
    private lateinit var viewModel: AnasayfaViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_anasayfa, container, false)


        // dataBinding ile title verme
        binding.anasayfaToolbarBaslik = "Anasayfa"

        // fdsfsdfsdfsd

        viewModel.filmlerListesi.observe(viewLifecycleOwner){
            // Adapter sınıfı oluşturulur ve recyclerview'e set edilir
            val adapter = FilmlerAdapter(requireContext(), it)

            // dataBinding kullanılarak adapter set edilir
            binding.filmlerAdapter = adapter
        }

            // Firebase'e veri eklemek icin tek seferilik calistirildi
//        val db = Firebase.firestore
//        val collectionFilmler = db.collection("Filmler")
//
//        val f1 = Filmler("", "DJango", "django.png", 24)
//        val f2 = Filmler("", "Interstellar", "interstellar.png", 32)
//        val f3 = Filmler("", "Inception", "inception.png", 16)
//        val f4 = Filmler("", "The Hateful Eight", "thehatefuleight.png", 28)
//        val f5 = Filmler("", "The Pianist", "thepianist.png", 18)
//        val f6 = Filmler("", "Anadoluda", "anadoluda.png", 10)
//
//        collectionFilmler.document().set(f1)
//        collectionFilmler.document().set(f2)
//        collectionFilmler.document().set(f3)
//        collectionFilmler.document().set(f4)
//        collectionFilmler.document().set(f5)
//        collectionFilmler.document().set(f6)

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // viewmodel oluşturulur
        val tempViewModel: AnasayfaViewModel by viewModels()
        viewModel = tempViewModel

    }

}