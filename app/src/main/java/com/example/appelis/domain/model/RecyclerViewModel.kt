package com.example.appelis.domain.model


import com.example.appelis.model.RecyclerViewResponseList

data class RecyclerViewModel(
    val id: Int,
//    val title: String,
//    val description: String,
    val imagePoster: String,
//    val imageLandscape: String
)

fun RecyclerViewResponseList.toDomain() =
    RecyclerViewModel(id, imagePoster)

//fun MoviePopularEntity.toDomain() = MoviePopular(id, title, description, imagePoster, imageLandscape)