package com.example.gulftech_androidtask.ui.home.homeFragment.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gulftech_androidtask.data.model.response.Data
import com.example.gulftech_androidtask.data.model.response.PropertyImage
import com.example.gulftech_androidtask.databinding.PropertyListItemBinding
import com.example.gulftech_androidtask.ui.home.homeFragment.adapter.ItemSliderAdapter

class PropertyViewHolder(private val binding: PropertyListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bindTo(data: Data?) {
        binding.propertyListCategoryText.text = data?.category
        binding.propertyLostPriceText.text = data?.price
        binding.propertyListAddressText.text = data?.address
        binding.propertyListBedroomNum.text = data?.bedRoom.toString()
        binding.propertyListBathroomNum.text = data?.bathRoom.toString()
        binding.propertyListAreaNum.text = data?.area.toString()
        initializeViewPage(data?.propertyImages)
    }

    private fun initializeViewPage(propertyImage: List<PropertyImage>?) {
        val sliderAdapter = ItemSliderAdapter()
        binding.propertyListImageSliderViewpager.adapter = sliderAdapter
        sliderAdapter.submitList(propertyImage)
    }

    companion object {
        fun from(parent: ViewGroup): PropertyViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = PropertyListItemBinding.inflate(layoutInflater, parent, false)
            return PropertyViewHolder(binding)
        }
    }

}