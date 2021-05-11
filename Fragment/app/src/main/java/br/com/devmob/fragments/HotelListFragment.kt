package br.com.devmob.fragments

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import androidx.fragment.app.ListFragment

class HotelListFragment: ListFragment(), HotelListView {
    private val presenter = HotelListPresenter(this, MemoryRepository)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.searchHotel("")
    }

    override fun showHotels(hotels: List<Hotel>){
        val adapter = ArrayAdapter<Hotel>(requireContext(),
        android.R.layout.simple_list_item_1, hotels)
        listAdapter = adapter
    }

    override fun showHotelDetails(hotel: Hotel) {
        TODO("Not yet implemented")
    }
}