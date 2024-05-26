package com.example.filmlerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filmlerapp.data.entitiy.Filmler
import com.example.filmlerapp.data.repository.FilmlerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AnasayfaViewModel @Inject constructor(var filmlerRepo : FilmlerRepository) : ViewModel() {


    // dependency
    //var filmlerRepo = FilmlerRepository()


    // MutableLiveData ile veri değişikliklerini izleyebiliriz
    var filmlerListesi = MutableLiveData<List<Filmler>>()


    // Uygualama ilk acildigi anda filmleri yukle
    init {
        filmleriYukle()
    }

    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            filmlerListesi.value = filmlerRepo.filmleriYukle()
        }
    }



}