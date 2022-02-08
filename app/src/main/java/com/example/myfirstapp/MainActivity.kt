package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.rv)
        val dataList = getUserList()
        showData(dataList)
    }

    fun showData(dataList: List<User>) {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = userAdapter(dataList)
        recyclerView.adapter = adapter
    }

    fun getUserList() : List<User> {
        val userList = mutableListOf<User>()
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))
        userList.add(User("Ishtiaq", "01858795079"))
        userList.add(User("Mehedi", "01845795633"))
        userList.add(User("Tapojit", "01771410687"))

        return userList
    }
}