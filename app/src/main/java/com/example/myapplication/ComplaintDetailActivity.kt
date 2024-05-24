package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ComplaintDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complaint_detail)
        val images= arrayListOf(R.drawable.screenshot_20221208_174712,R.drawable.screenshot_20221228_173946,
            R.drawable.screenshot_20221208_174712)

        val recyclerView=findViewById<RecyclerView>(R.id.recycler_view)
        val layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager=layoutManager
        val adapter=ImageAdapter(images,this)
         recyclerView.adapter=adapter

    }
}