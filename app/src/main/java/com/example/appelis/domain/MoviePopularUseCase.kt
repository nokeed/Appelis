package com.example.appelis.domain

import com.example.appelis.data.RecyclerViewRepository
import com.example.appelis.domain.model.RecyclerViewModel
import javax.inject.Inject


class MoviePopularUseCase @Inject constructor(
    private val repository: RecyclerViewRepository
) {
//    private val repository = MovieDetailRepository()

    suspend operator fun invoke(): List<RecyclerViewModel> =
        repository.getPopularMoviesListFromApi()
}