package br.com.devmob.fragments

class HotelListPresenter (
    private val view: HotelListView,
    private val repository: HotelRepository
        ){

    fun searchHotel(term: String){
        repository.search(term){ hotels ->
            view.showHotels(hotels)
        }
    }

    fun showHotelDetails(hotel: Hotel){
        view.showHotelDetails(hotel)
    }
}