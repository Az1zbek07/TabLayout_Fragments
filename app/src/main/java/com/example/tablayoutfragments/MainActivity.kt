package com.example.tablayoutfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.tablayoutfragments.adapter.ViewPagerAdapter
import com.example.tablayoutfragments.util.Constants
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val viewPager: ViewPager = findViewById(R.id.viewPager)

        tabLayout.addTab(tabLayout.newTab().setText(Constants.titles[0]))
        tabLayout.addTab(tabLayout.newTab().setText(Constants.titles[1]))
        tabLayout.addTab(tabLayout.newTab().setText(Constants.titles[2]))

        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)?.setIcon(Constants.icons[0])
        tabLayout.getTabAt(1)?.setIcon(Constants.icons[1])
        tabLayout.getTabAt(2)?.setIcon(Constants.icons[2])
    }
}