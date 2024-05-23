package com.example.filmlerapp.data.repository

import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.entitiy.Filmler

class FilmlerRepository {

    var filmlerDataSource = FilmlerDataSource()

    suspend fun filmleriYukle() : List<Filmler> = filmlerDataSource.filmleriYukle()


}