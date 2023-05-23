package com.example.appelis.view.popularmoviesrv

import android.view.View

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.appelis.databinding.RvItemBinding
import com.example.appelis.domain.model.RecyclerViewModel


class MoviesPopularViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var binding = RvItemBinding.bind(view)


    fun render(moviesPopular: RecyclerViewModel) {

//        binding.tvmovieTitle.text = moviesPopular.title
//        binding.tvmovieDescription.text = moviesPopular.description
        binding.ivmovieBackground.load("https://image.tmdb.org/t/p/w500" + moviesPopular.imagePoster)

//        binding.ivDrinkImg.load(drinksResults.drinkImage){
//            transformations(coil.transform.RoundedCornersTransformation(100f))}

    }


}
