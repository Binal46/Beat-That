package com.infotechtime.beatthat.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager

import com.google.android.material.tabs.TabLayout
import com.infotechtime.beatthat.R
import com.infotechtime.beatthat.adapter.ViewPagerAdapter

class MatchesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.matches_fragment, container,
            false)

        val activity = activity as Context

        val tabs = view.findViewById(R.id.tab_layout) as TabLayout
        val viewPager = view.findViewById(R.id.viewPager) as ViewPager

        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(LiveFragment(), "Live")
        adapter.addFragment(UpcomingFragment(), "Upcoming")
        adapter.addFragment(RecentFragment(), "Recent")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        return view
    }
}