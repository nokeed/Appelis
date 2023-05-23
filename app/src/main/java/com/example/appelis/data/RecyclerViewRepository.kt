package com.example.appelis.data

import com.example.appelis.data.network.RecyclerViewService
import com.example.appelis.domain.model.RecyclerViewModel
import com.example.appelis.domain.model.toDomain
import javax.inject.Inject

class RecyclerViewRepository @Inject constructor(
    private val api: RecyclerViewService,
//    private val movieDetailDao: MoviePopularDao
) {

//    private val api = MovieDetailService()

    suspend fun getPopularMoviesListFromApi(): List<RecyclerViewModel> {
        val response = api.getPopularMoviesList()

        return response.map { it.toDomain() }
    }


    suspend fun getPopularTvShowsFromApi(): List<RecyclerViewModel>{
        val response = api.getPopularTvShows()
        return response.map {it.toDomain()}
    }
//    suspend fun getPopularMoviesFromDatabase(): List<MoviePopular> {
//        val response = movieDetailDao.getMoviePopular()
//
//        return response.map { it.toDomain() }
//    }
}