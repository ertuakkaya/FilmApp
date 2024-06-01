package com.example.filmlerapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.filmlerapp.data.entitiy.Filmler

@Database(entities = [Filmler::class], version = 1)
abstract class Veritabani : RoomDatabase() {

    // Interface'i getir
    abstract fun getFilmlerDao() : FilmlerDao



}