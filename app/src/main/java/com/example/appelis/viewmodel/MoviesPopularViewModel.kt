package com.example.appelis.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appelis.domain.MoviePopularUseCase
import com.example.appelis.domain.model.RecyclerViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesPopularViewModel @Inject constructor(private val getMoviesPopularUseCase: MoviePopularUseCase) : ViewModel() {

//    var getMoviePopularUseCase = MovieDetailUseCase()
    val moviePopular = MutableLiveData<List<RecyclerViewModel>>()


    fun onCreate(){
        viewModelScope.launch {
            val result: List<RecyclerViewModel> = getMoviesPopularUseCase.invoke()
            moviePopular.postValue(result)
        }
    }
}
