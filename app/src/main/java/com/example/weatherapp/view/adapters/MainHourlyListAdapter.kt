package com.example.weatherapp.view.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.example.weatherapp.business.model.HourlyWeatherModel
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.databinding.ItemMainHourlyBinding
import com.google.android.material.textview.MaterialTextView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife

const val TAG = "RV_TEST"
class MainHourlyListAdapter: BaseAdapter<HourlyWeatherModel>(){


    lateinit var binding: ItemMainHourlyBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemMainHourlyBinding.inflate(layoutInflater)
        val view = binding.root
        return HourlyViewHolder(view)
    }



    inner class HourlyViewHolder(view: View): BaseViewHolder(view){


        init {


        }

        override fun bindView(position: Int) {


            binding.itemHourlyPopTv.text = "17%"
            binding.itemHourlyTempTv.text = "19\u00B0"
            binding.itemHourlyTimeTv.text = "19:00"
            binding.itemHourlyConditionIcon.setImageResource(R.drawable.ic_sun)



        }
    }
}



