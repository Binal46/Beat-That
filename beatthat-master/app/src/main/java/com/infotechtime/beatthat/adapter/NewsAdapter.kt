package com.infotechtime.beatthat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.infotechtime.beatthat.R
import com.infotechtime.beatthat.model.NewsModel


class NewsAdapter(val newsList: ArrayList<NewsModel>,val context: Context) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardview_news_list, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
      //  holder.bindItems(newsList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return 4
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(news: NewsModel) {

        }
    }
}