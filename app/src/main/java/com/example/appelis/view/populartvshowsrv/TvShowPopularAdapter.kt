package com.example.appelis.view.populartvshowsrv

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appelis.R
import com.example.appelis.domain.model.RecyclerViewModel


class TvShowPopularAdapter(var tvshowsPopularList: List<RecyclerViewModel> = emptyList()): RecyclerView.Adapter<TvShowPopularViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(tvshowsPopularList:List<RecyclerViewModel>){
        this.tvshowsPopularList = tvshowsPopularList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowPopularViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TvShowPopularViewHolder(layoutInflater.inflate(R.layout.rv_item,parent,false))
    }

    override fun getItemCount(): Int {
        return tvshowsPopularList.size
    }

    override fun onBindViewHolder(holder: TvShowPopularViewHolder, position: Int) {
        return holder.render(tvshowsPopularList[position])
    }
}