package com.example.appelis.model

import com.google.gson.annotations.SerializedName

data class MovieDetailResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val result: List<MoviePopularResponseList>)

data class MoviePopularResponseList(
    @SerializedName("id")  val id : Int,
    @SerializedName("original_title")  val title : String,
//    @SerializedName("vote_average")  val voteAverage : Int,
    @SerializedName("overview")  val description : String,
    @SerializedName("poster_path")  val imagePoster : String, // https://image.tmdb.org/t/p/w500/
    @SerializedName("backdrop_path")  val imageLandscape : String, // https://image.tmdb.org/t/p/w500/
)
