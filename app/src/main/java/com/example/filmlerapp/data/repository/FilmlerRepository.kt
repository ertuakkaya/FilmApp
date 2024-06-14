package com.example.filmlerapp.data.repository

import androidx.lifecycle.MutableLiveData
import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.entitiy.Filmler

class FilmlerRepository(var filmlerDataSource: FilmlerDataSource) {


    //var filmlerDataSource = FilmlerDataSource()

    fun filmleriYukle() : MutableLiveData<List<Filmler>> = filmlerDataSource.filmleriYukle()


}