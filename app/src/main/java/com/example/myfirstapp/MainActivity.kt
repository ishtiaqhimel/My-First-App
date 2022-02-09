package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.model.Post
import com.example.myfirstapp.network.NetWorkClient

class MainActivity : AppCompatActivity(), NetworkCallback {

    private lateinit var recyclerView: RecyclerView
    private val networkClient = NetWorkClient(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.rv)
        networkClient.getPost()

    }

    fun showData(dataList: List<Post>) {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = userAdapter(dataList)
        recyclerView.adapter = adapter
    }

    override fun getList(postList: List<Post>) {
        Log.d("PostList", "onResponse ===>$postList")
        showData(postList)
    }
}