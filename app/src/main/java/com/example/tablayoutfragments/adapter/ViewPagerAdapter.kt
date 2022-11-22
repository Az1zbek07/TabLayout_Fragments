package com.example.tablayoutfragments.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tablayoutfragments.fragment.FragmentBackend
import com.example.tablayoutfragments.fragment.FragmentFront
import com.example.tablayoutfragments.fragment.FragmentMobile

class ViewPagerAdapter(
    fragmentManager: FragmentManager
): FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> FragmentMobile()
            1-> FragmentFront()
            2 -> FragmentBackend()
            else -> Fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Mobile"
            1 -> "Front"
            2 -> "Backend"
            else -> ""
        }
    }
}