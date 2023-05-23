package com.example.appelis.view.popularmoviesrv

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appelis.R
import com.example.appelis.domain.model.RecyclerViewModel

class MoviePopularAdapter(var moviePopularList : List<RecyclerViewModel> = emptyList()):RecyclerView.Adapter<MoviesPopularViewHolder>() {


    @SuppressLint("NotifyDataSetChanged")
    fun updateData(moviePopularList: List<RecyclerViewModel>) {

        this.moviePopularList = moviePopularList
        notifyDataSetChanged()


    }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesPopularViewHolder {
        val layoutInflater =LayoutInflater.from(parent.context)
        return MoviesPopularViewHolder(layoutInflater.inflate(R.layout.rv_item,parent,false))
    }



    override fun getItemCount(): Int {
        return moviePopularList.size
    }

    override fun onBindViewHolder(holder: MoviesPopularViewHolder, position: Int) {
        holder.render(moviePopularList[position])
    }

}
