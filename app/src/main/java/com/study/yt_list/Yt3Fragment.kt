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


class Yt3Fragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_yt3, container, false)

        val items = mutableListOf<String>()
        items.add("김현윤")
        items.add("1991년 7월 20일 (30세)")
        items.add("173.3cm, 81.4kg")
        items.add("대머리, 빡빡이, 문어, 크라켄, 타코야끼")
        items.add("ESFP")
        items.add("우왁굳TV, 패러블")
        items.add("우왁굳TV 소속 前 아프리카TV")
        items.add("전직 요리사")
        items.add("트위치 스트리머")
        items.add("메이플스토리")
        items.add("로스트아크")
        items.add("우왁굳")
        items.add("개복어")
        items.add("천양")
        items.add("코렛트")


        val rv = view.findViewById<RecyclerView>(R.id.YtRv3)
        val rvAdapter =RVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image1).setOnClickListener{
            it.findNavController().navigate(R.id.action_yt3Fragment_to_yt1Fragment)
        }
        view.findViewById<ImageView>(R.id.image2).setOnClickListener{
            it.findNavController().navigate(R.id.action_yt3Fragment_to_yt2Fragment)
        }
        return view
    }

}