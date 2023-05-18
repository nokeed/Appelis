package com.example.appelis.model

class MovieDetailRepository {

    private val api = MovieDetailService()

    suspend fun getMovieDetail(): List<MoviePopularResponseList>? {
        val response = api.getMovieDetail()
        if (response != null) {
            MovieDetailProvider.movieDetail = response
        }
        return response

    }
}