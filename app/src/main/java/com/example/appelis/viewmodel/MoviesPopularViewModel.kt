package com.example.appelis.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appelis.model.MovieDetailResponse
import com.example.appelis.model.MovieDetailUseCase
import com.example.appelis.model.MoviePopularResponseList
import kotlinx.coroutines.launch

class MoviesPopularViewModel : ViewModel() {

    var getMoviePopularUseCase = MovieDetailUseCase()
    val moviePopular = MutableLiveData<List<MoviePopularResponseList>>()


    fun onCreate(){
        viewModelScope.launch {
            val result: List<MoviePopularResponseList> = getMoviePopularUseCase.invoke()
            moviePopular.postValue(result)
        }
    }
}
