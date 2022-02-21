package com.example.git_example.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.git_example.R
import com.example.git_example.model.recyclerListSchool

class AdapterSchool(
    private val context: Context,
    private val dataset: List<recyclerListSchool>) : RecyclerView.Adapter<AdapterSchool.ItemViewHolder>() {

    class ItemViewHolder (private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =
            context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount() = dataset.size
}