//package com.example.appelis.data.database.dao
//
//import androidx.room.Dao
//import androidx.room.Insert
//import androidx.room.Query
//import com.example.appelis.data.database.entities.MoviePopularEntity
//
//@Dao
//interface MoviePopularDao {
//
//    @Query("SELECT * FROM movie_detail")
//    suspend fun getMoviePopular():List<MoviePopularEntity>
//
//    @Insert
//    suspend fun insertMovieDetail(movieDetailList:List<MoviePopularEntity>)
//}