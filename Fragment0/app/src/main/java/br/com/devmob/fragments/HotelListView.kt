package br.com.devmob.fragments

interface HotelListView {
    fun showHotels (hotels: List<Hotel>)
    fun showHotelDetails(hotel: Hotel)
}