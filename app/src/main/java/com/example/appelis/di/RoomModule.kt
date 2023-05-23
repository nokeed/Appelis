//package com.example.appelis.di
//
//import android.content.Context
//import androidx.room.Room
//import com.example.appelis.core.Auth.MOVIE_DETAIL_DATABASE
//import com.example.appelis.data.database.MoviePopularDatabase
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.qualifiers.ApplicationContext
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object RoomModule {
//
//    @Singleton
//    @Provides
//    fun provideRoom(@ApplicationContext context: Context) = Room.databaseBuilder(context,MoviePopularDatabase::class.java,MOVIE_DETAIL_DATABASE).build()
//
//    @Singleton
//    @Provides
//    fun provideMoviePopularDao(movieDetailDatabase: MoviePopularDatabase) = movieDetailDatabase.getMovieDetailDao()
//}