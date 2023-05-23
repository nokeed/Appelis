package com.example.appelis.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appelis.domain.TvShowsUseCase
import com.example.appelis.domain.model.RecyclerViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TvShowsPopularViewModel @Inject constructor(private val tvshowsPopularUseCase: TvShowsUseCase) :
    ViewModel() {

    val tvshowsPopular = MutableLiveData<List<RecyclerViewModel>>()

    fun onCreate() {
        viewModelScope.launch {
            val result: List<RecyclerViewModel> = tvshowsPopularUseCase.invoke()
            tvshowsPopular.postValue(result)
        }
    }

}