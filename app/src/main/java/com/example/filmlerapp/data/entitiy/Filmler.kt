package com.example.filmlerapp.data.entitiy

import java.io.Serializable

data class Filmler(
                    var film_id: String? ="",
                    var film_ad: String? ="",
                    var film_resim: String? ="",
                    var film_fiyat: Int? = 0
                ) : Serializable {
}