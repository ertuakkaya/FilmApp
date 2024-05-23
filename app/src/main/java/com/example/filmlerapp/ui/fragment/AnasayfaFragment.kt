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


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // viewmodel oluşturulur
        val tempViewModel: AnasayfaViewModel by viewModels()
        viewModel = tempViewModel

    }

}