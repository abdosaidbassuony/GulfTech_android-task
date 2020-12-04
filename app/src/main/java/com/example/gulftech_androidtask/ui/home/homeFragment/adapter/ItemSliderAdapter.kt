package com.example.gulftech_androidtask.ui.home.homeFragment.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.gulftech_androidtask.data.model.response.PropertyImage
import com.example.gulftech_androidtask.ui.home.homeFragment.viewholder.ItemSliderImageViewHolder


class ItemSliderAdapter() : ListAdapter<PropertyImage, ItemSliderImageViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemSliderImageViewHolder {
        return ItemSliderImageViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ItemSliderImageViewHolder, position: Int) {
        return holder.bindTo(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<PropertyImage>() {
            override fun areItemsTheSame(oldItem: PropertyImage, newItem: PropertyImage): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: PropertyImage,
                newItem: PropertyImage
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}