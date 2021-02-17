package com.infotechtime.beatthat.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.infotechtime.beatthat.R
import com.infotechtime.beatthat.adapter.NewsAdapter
import com.infotechtime.beatthat.model.NewsModel

class HomeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.home_fragment, container,
            false)

        val activity = activity as Context

        //crating an arraylist to store users using the data class user
        val news = ArrayList<NewsModel>()


        val adapter = NewsAdapter(news,activity)
        val rcv_topstories = view.findViewById<RecyclerView>(R.id.rcv_top_stories)
        rcv_topstories.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false) as RecyclerView.LayoutManager?
        rcv_topstories.adapter = adapter;
        return view
    }
}