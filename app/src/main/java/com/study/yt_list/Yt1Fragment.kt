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


class Yt1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_yt1, container, false)

        val items = mutableListOf<String>()
        items.add("장지환")
        items.add("1995년 12월 24일 (26세)")
        items.add("대전광역시 대덕구 법동")
        items.add("대전광역시 유성구 도룡동 스마트시티")
        items.add("대한민국")
        items.add("175cm, 60kg, O형")
        items.add("대전법동초등학교 (졸업)")
        items.add("대전법동중학교 (졸업)")
        items.add("동대전고등학교 (졸업)")
        items.add("CHARON")
        items.add("리그 오브 레전드")
        items.add("로스트아크")
        items.add("메이플스토리")

        val rv= view.findViewById<RecyclerView>(R.id.YtRv1)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image2).setOnClickListener{
            it.findNavController().navigate(R.id.action_yt1Fragment_to_yt2Fragment)
        }
        view.findViewById<ImageView>(R.id.image3).setOnClickListener{
            it.findNavController().navigate(R.id.action_yt1Fragment_to_yt3Fragment)
        }
        return view
    }

}