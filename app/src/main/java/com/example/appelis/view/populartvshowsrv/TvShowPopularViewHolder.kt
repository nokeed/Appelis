package com.example.appelis.view.populartvshowsrv

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.appelis.databinding.RvItemBinding
import com.example.appelis.domain.model.RecyclerViewModel

class TvShowPopularViewHolder(view: View) : RecyclerView.ViewHolder(view) {


    val binding = RvItemBinding.bind(view)

    fun render(tvshowsPopular: RecyclerViewModel) {

        binding.ivmovieBackground.load("https://image.tmdb.org/t/p/w500"+ tvshowsPopular.imagePoster)

    }
}
