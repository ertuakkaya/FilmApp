package com.example.filmlerapp.di

import android.content.Context
import androidx.room.Room
import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.repository.FilmlerRepository
import com.example.filmlerapp.room.FilmlerDao
import com.example.filmlerapp.room.Veritabani
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideFilmlerRepository(filmlerDataSource : FilmlerDataSource) : FilmlerRepository{
        return FilmlerRepository(filmlerDataSource)
    }

    @Provides
    @Singleton
    fun provideFilmlerDataSource(filmlerDao : FilmlerDao) : FilmlerDataSource{
        return FilmlerDataSource(filmlerDao)
    }

    @Provides
    @Singleton
    fun provideFilmleDao(@ApplicationContext context:Context) : FilmlerDao{

        val vt = Room.databaseBuilder(context,Veritabani::class.java,
            "filmler_app.sqlite").createFromAsset("filmler_app.sqlite").build()

        return vt.getFilmlerDao()
    }

}