package com.infotechtime.beatthat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.infotechtime.beatthat.R
import com.infotechtime.beatthat.model.UpcomingMatchModel


class UpcomingMatchAdapter(val upcomingmatchList: ArrayList<UpcomingMatchModel>, val context: Context) :
    RecyclerView.Adapter<UpcomingMatchAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingMatchAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardview_match_upcoming_list, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: UpcomingMatchAdapter.ViewHolder, position: Int) {
       // holder.bindItems(livematchList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return 4
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(upcomingmatch: UpcomingMatchModel) {

        }
    }
}