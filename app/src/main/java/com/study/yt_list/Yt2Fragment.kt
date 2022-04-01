package com.study.yt_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Yt2Fragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_yt2, container, false)

        val items = mutableListOf<String>()
        items.add("손인욱")
        items.add("밀양 손씨")
        items.add("대한민국")
        items.add("1994년 5월 21일 (27세)")
        items.add(" 탑, 바텀(원거리 딜러)")
        items.add("Akaps")
        items.add("리그 오브 레전드")
        items.add("오버워치")
        items.add("배틀그라운드")
        items.add("스타크래프트 1")
        items.add("이재석")
        items.add("도파")
        items.add("랄로")
        items.add("괴물쥐")
        items.add("피닉스박")


        val rv =view.findViewById<RecyclerView>(R.id.YtRv2)
        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager =LinearLayoutManager(context)


        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            it.findNavController().navigate(R.id.action_yt2Fragment_to_yt1Fragment)
        }
        view.findViewById<ImageView>(R.id.image3).setOnClickListener {
            it.findNavController().navigate(R.id.action_yt2Fragment_to_yt3Fragment)
        }
        return view

    }


}