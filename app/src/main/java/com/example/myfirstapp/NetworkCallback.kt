package com.example.myfirstapp

import com.example.myfirstapp.model.Post

interface NetworkCallback {
    fun getList(postList: List<Post>)
}