package com.example.myfirstapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.model.Post
import com.google.android.material.textview.MaterialTextView

class userAdapter(val userList: List<Post>) : RecyclerView.Adapter<userAdapter.viewHolder>() {

    class viewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val useId: MaterialTextView = view.findViewById(R.id.tvuserId)
        val id: MaterialTextView = view.findViewById(R.id.tvid)
        val title: MaterialTextView = view.findViewById(R.id.tvtitle)
        val body: MaterialTextView = view.findViewById(R.id.tvbody)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.info_single_item, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentData = userList[position]
        holder.useId.text = currentData.userId.toString()
        holder.id.text = currentData.userId.toString()
        holder.title.text = currentData.title
        holder.body.text = currentData.body
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}