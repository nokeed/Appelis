package com.example.appelis.data.network

import com.example.appelis.core.Auth.API_KEY
import com.example.appelis.model.RecyclerViewResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {
    @GET("movie/popular?api_key=$API_KEY")
    suspend fun getPopularMovies():Response<RecyclerViewResponse>

    @GET("tv/popular?api_key=$API_KEY")
    suspend fun getPopularTvShows():Response<RecyclerViewResponse>
}