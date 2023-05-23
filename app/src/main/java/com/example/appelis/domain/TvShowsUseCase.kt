package com.example.appelis.domain

import com.example.appelis.data.RecyclerViewRepository
import com.example.appelis.domain.model.RecyclerViewModel
import javax.inject.Inject

class TvShowsUseCase @Inject constructor(
    private val repository: RecyclerViewRepository
) {

    suspend operator fun invoke(): List<RecyclerViewModel> =
        repository.getPopularTvShowsFromApi()

}