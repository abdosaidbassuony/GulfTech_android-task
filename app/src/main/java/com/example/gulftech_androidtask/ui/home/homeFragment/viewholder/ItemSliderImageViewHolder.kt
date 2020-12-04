package com.example.gulftech_androidtask.ui.home.homeFragment.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gulftech_androidtask.data.model.response.PropertyImage
import com.example.gulftech_androidtask.databinding.SliderItemViewBinding

class ItemSliderImageViewHolder(private val binding: SliderItemViewBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bindTo(data: PropertyImage?) {
        Glide.with(itemView.context).load(data?.url).into(binding.sliderImage)
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): ItemSliderImageViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = SliderItemViewBinding.inflate(layoutInflater, parent, false)
            return ItemSliderImageViewHolder(binding)
        }
    }
}