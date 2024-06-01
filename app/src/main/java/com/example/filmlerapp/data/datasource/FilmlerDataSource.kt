package com.example.filmlerapp.data.datasource

import com.example.filmlerapp.data.entitiy.Filmler
import com.example.filmlerapp.room.FilmlerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource (var filmlerDao : FilmlerDao) {


    suspend fun filmleriYukle() : List<Filmler> =

        withContext(Dispatchers.IO) {

            return@withContext filmlerDao.filmleriYukle()
        }

}