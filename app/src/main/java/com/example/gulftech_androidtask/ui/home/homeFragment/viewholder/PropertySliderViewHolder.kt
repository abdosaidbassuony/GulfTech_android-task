package com.example.gulftech_androidtask.ui.home.homeFragment.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gulftech_androidtask.R
import com.example.gulftech_androidtask.data.model.response.Data
import com.example.gulftech_androidtask.databinding.SliderPropertyItemBinding

class PropertySliderViewHolder (private val binding: SliderPropertyItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Data) {
        Glide.with(binding.propertySliderImage)
            .load(item.propertyImages?.first()?.url)
            .placeholder(R.drawable.ic_launcher_background)
            .into(binding.propertySliderImage)
        binding.categoryText.text = item.category
        binding.addressText.text = item.address
        binding.priceText.text = item.price
        binding.bedroomNumberText.text = item.bedRoom.toString()
        binding.bathroomNumberText.text = item.bathRoom.toString()
        binding.areaNumberText.text = item.area.toString()
    }

    companion object {
        fun from(parent: ViewGroup): PropertySliderViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = SliderPropertyItemBinding.inflate(layoutInflater, parent, false)
            return PropertySliderViewHolder(binding)
        }
    }
}