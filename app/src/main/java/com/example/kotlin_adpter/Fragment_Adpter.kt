package com.example.kotlin_adpter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.kotlin_adpter.fargment.CallFragment
import com.example.kotlin_adpter.fargment.ChatFragment
import com.example.kotlin_adpter.fargment.StatusFragment

class Fragment_Adpter(mainActivity: MainActivity, supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(supportFragmentManager) {


    override fun getCount(): Int {
        return 3
    }


    override fun getItem(position: Int): Fragment {


        return when(position)
        {
            0->ChatFragment()
            1->StatusFragment()
            else -> CallFragment()

        }

    }


}