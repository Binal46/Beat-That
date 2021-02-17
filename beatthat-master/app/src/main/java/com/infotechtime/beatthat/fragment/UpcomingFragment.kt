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
import com.infotechtime.beatthat.adapter.UpcomingMatchAdapter
import com.infotechtime.beatthat.model.LiveMatchModel
import com.infotechtime.beatthat.model.UpcomingMatchModel

class UpcomingFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.upcomming_fragment, container,
            false)

        val activity = activity as Context

        val upcomingmatch = ArrayList<UpcomingMatchModel>()

        val adapter = UpcomingMatchAdapter(upcomingmatch,activity)
        val rcv_upcoming = view.findViewById<RecyclerView>(R.id.rcv_match_upcoming)
        rcv_upcoming.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false) as RecyclerView.LayoutManager?
        rcv_upcoming.adapter = adapter;
        return view
    }
}