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
import com.infotechtime.beatthat.adapter.RecentMatchAdapter
import com.infotechtime.beatthat.adapter.UpcomingMatchAdapter
import com.infotechtime.beatthat.model.RecentMatchModel
import com.infotechtime.beatthat.model.UpcomingMatchModel

class RecentFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.recent_fragment, container,
            false)

        val activity = activity as Context

        val recentmatch = ArrayList<RecentMatchModel>()

        val adapter = RecentMatchAdapter(recentmatch,activity)
        val rcv_recent = view.findViewById<RecyclerView>(R.id.rcv_match_recent)
        rcv_recent.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false) as RecyclerView.LayoutManager?
        rcv_recent.adapter = adapter;
        return view
    }
}