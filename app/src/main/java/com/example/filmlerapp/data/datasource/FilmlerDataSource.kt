package com.example.filmlerapp.data.datasource

import com.example.filmlerapp.data.entitiy.Filmler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource {


    suspend fun filmleriYukle() : List<Filmler> =

        withContext(Dispatchers.IO) {
            // Data class kullanılarak filmler listesi oluşturulur
            val filmlerListesi = ArrayList<Filmler>()

            val f1 = Filmler(1, "DJango", "django", 10)
            val f2 = Filmler(2, "Inception", "inception", 20)
            val f3 = Filmler(3, "Interstellar", "interstellar", 30)
            val f4 = Filmler(4, "Pianist", "thepianist", 40)
            val f5 = Filmler(5, "The Hateful Leight", "thehatefuleight", 50)
            val f6 = Filmler(6, "Anadoluda", "anadoluda", 60)
            filmlerListesi.add(Filmler(7, "Dune", "anadoluda", 72))
            filmlerListesi.add(f1)
            filmlerListesi.add(f2)
            filmlerListesi.add(f3)
            filmlerListesi.add(f4)
            filmlerListesi.add(f5)
            filmlerListesi.add(f6)

            return@withContext filmlerListesi
        }

}