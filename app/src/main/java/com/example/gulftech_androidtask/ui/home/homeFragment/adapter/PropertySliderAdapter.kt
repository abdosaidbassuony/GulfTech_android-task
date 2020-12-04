package com.example.gulftech_androidtask.ui.home.homeFragment.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.gulftech_androidtask.data.model.response.Data
import com.example.gulftech_androidtask.ui.home.homeFragment.viewholder.PropertySliderViewHolder

class PropertySliderAdapter() : ListAdapter<Data, PropertySliderViewHolder>(DIFF_CALLBACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PropertySliderViewHolder {
        return PropertySliderViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PropertySliderViewHolder, position: Int) {
        return holder.bind(getItem(position))
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
