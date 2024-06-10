package com.example.filmlerapp.data.repository

import com.example.filmlerapp.data.datasource.FilmlerDataSource

import com.example.filmlerapp.data.entity.Filmler
import javax.inject.Inject

class FilmlerRepository @Inject constructor (var filmlerDataSource: FilmlerDataSource){

    //var filmlerDataSource = FilmlerDataSource()

    suspend fun filmleriYukle() : List<Filmler> = filmlerDataSource.filmleriYukle()


}