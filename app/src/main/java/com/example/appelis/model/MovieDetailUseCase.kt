package com.example.appelis.model

class MovieDetailUseCase   {
    private val repository = MovieDetailRepository()

    suspend operator fun invoke():List<MoviePopularResponseList> = repository.getMovieDetail() ?: emptyList()
    }
