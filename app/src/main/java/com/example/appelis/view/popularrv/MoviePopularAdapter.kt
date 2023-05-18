package com.example.appelis.view.popularrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.appelis.R
import com.example.appelis.model.MoviePopularResponseList
import com.example.appelis.viewmodel.MoviesPopularViewModel

class MoviePopularAdapter(var moviePopularList : List<MoviePopularResponseList> = emptyList()):RecyclerView.Adapter<MoviesPopularViewHolder>() {


    fun updateData(moviePopularList: List<MoviePopularResponseList>) {

        this.moviePopularList = moviePopularList
        notifyDataSetChanged()


    }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesPopularViewHolder {
        val layoutInflater =LayoutInflater.from(parent.context)
        return MoviesPopularViewHolder(layoutInflater.inflate(R.layout.movie_detail_item,parent,false))
    }



    override fun getItemCount(): Int {
        return moviePopularList.size
    }

    override fun onBindViewHolder(holder: MoviesPopularViewHolder, position: Int) {
        holder.render(moviePopularList[position])
    }

}
