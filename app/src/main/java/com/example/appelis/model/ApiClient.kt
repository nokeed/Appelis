package com.example.appelis.model

import com.example.appelis.model.Auth.API_KEY
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {
    @GET("movie/popular?api_key=$API_KEY")
    suspend fun getPopularMovies():Response<MovieDetailResponse>
}