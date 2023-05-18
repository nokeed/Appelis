package com.example.appelis.view.popularrv

import android.view.View
import androidx.lifecycle.LifecycleOwner

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.appelis.databinding.MovieDetailItemBinding
import com.example.appelis.model.MoviePopularResponseList
import com.example.appelis.viewmodel.MoviesPopularViewModel


class MoviesPopularViewHolder(view:View):RecyclerView.ViewHolder(view) {

    private var binding =MovieDetailItemBinding.bind(view)


    fun render(moviesPopular: MoviePopularResponseList){

//        binding.tvmovieTitle.text = moviesPopular.title
//        binding.tvmovieDescription.text = moviesPopular.description
        binding.ivmovieBackground.load("https://image.tmdb.org/t/p/w500"+moviesPopular.imagePoster)

//        binding.ivDrinkImg.load(drinksResults.drinkImage){
//            transformations(coil.transform.RoundedCornersTransformation(100f))}

    }




}
