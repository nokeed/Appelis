package com.example.appelis.model

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class MovieDetailService {
    val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getMovieDetail(): List<MoviePopularResponseList>? {

        return withContext(Dispatchers.IO) {
            val response: Response<MovieDetailResponse> = retrofit.create(ApiClient::class.java).getPopularMovies()
            response.body()?.result
        }
    }
}