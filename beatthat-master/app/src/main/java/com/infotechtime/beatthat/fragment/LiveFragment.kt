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
import com.infotechtime.beatthat.adapter.LiveMatchAdapter
import com.infotechtime.beatthat.adapter.NewsAdapter
import com.infotechtime.beatthat.model.LiveMatchModel
import com.infotechtime.beatthat.model.NewsModel

class LiveFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.live_fragment, container,
            false)

        val activity = activity as Context

        val livematch = ArrayList<LiveMatchModel>()

        val adapter = LiveMatchAdapter(livematch,activity)
        val rcv_live = view.findViewById<RecyclerView>(R.id.rcv_match_live)
        rcv_live.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false) as RecyclerView.LayoutManager?
        rcv_live.adapter = adapter;
        return view
    }
}