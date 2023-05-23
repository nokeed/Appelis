package com.example.appelis.data.network

import com.example.appelis.model.RecyclerViewResponse
import com.example.appelis.model.RecyclerViewResponseList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class RecyclerViewService @Inject constructor(private val api: ApiClient) {
//    val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getPopularMoviesList(): List<RecyclerViewResponseList> {

        return withContext(Dispatchers.IO) {
            val response: Response<RecyclerViewResponse> =
                api.getPopularMovies()
            response.body()?.result ?: emptyList()
        }
    }

    suspend fun getPopularTvShows(): List<RecyclerViewResponseList>{
        return withContext(Dispatchers.IO){
            val response: Response<RecyclerViewResponse> = api.getPopularTvShows()
            response.body()?.result ?: emptyList()
        }
    }


}