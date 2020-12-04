package com.example.gulftech_androidtask.ui.home.homeFragment.adapter

import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.gulftech_androidtask.data.model.response.Data
import com.example.gulftech_androidtask.data.model.response.PropertyImage
import com.example.gulftech_androidtask.ui.home.homeFragment.viewholder.PropertyViewHolder

class PropertyListAdapter() : ListAdapter<Data, PropertyViewHolder>(DIFF_CALLBACK) {

    override fun onBindViewHolder(holder: PropertyViewHolder, position: Int) {
        return holder.bindTo(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PropertyViewHolder {
        return PropertyViewHolder.from(parent)
    }



    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Data>() {
            override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
                return oldItem == newItem
            }
        }
    }
}


