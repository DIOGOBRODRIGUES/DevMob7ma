package br.com.devmob.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class HotelDetailActivity : AppCompatActivity(){
    private val hotelId: Long by lazy {intent.getLongExtra(EXTRA_HOTEL_ID,-1)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_details)
        if(savedInstanceState == null){
            showHotelDetailsFragment()
        }
    }

    private fun showHotelDetailsFragment(){
        val fragment = HotelDetailFragment.newInstance(hotelId)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.details, fragment, HotelDetailFragment.TAG_DETAILS)
            .commit()
    }

    companion object{
        private const val EXTRA_HOTEL_ID = "hotel_id"
        fun open(context: Context, hotelId: Long){
            context.startActivity(Intent(context, HotelDetailActivity::class.java).apply{
                putExtra(EXTRA_HOTEL_ID, hotelId)
            })
        }
    }
}