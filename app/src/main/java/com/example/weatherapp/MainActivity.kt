package com.example.weatherapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.databinding.ItemMainHourlyBinding
import com.example.weatherapp.view.adapters.MainDailyListAdapter
import com.example.weatherapp.view.adapters.MainHourlyListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private lateinit var bindingSheet: ItemMainHourlyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
//        bindingSheet = ItemMainHourlyBinding.inflate(layoutInflater)

//        val bottomSheetView = bindingSheet.root
        val view = binding.root

//        setContentView(bottomSheetView)
        setContentView(view)

        binding.mainHourlyList.apply {
            adapter = MainHourlyListAdapter()
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)

        }

        binding.mainDailyList.apply {
            adapter = MainDailyListAdapter()
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            setHasFixedSize(true)
        }


        initViews()




    }

    private fun initViews(){
        binding.mainCityNameTv.text = "Moscow"
        binding.mainDateNameTv.text = "1 april"
        binding.mainIconWeatherConditions.setImageResource(R.drawable.ic_sun)
        binding.mainItem.text = "25\u00B0"
        binding.mainTempMinTv.text = "10"
        binding.mainTempMaxTv.text = "27"
        binding.mainWeatherImage.setImageResource(R.mipmap.cloud3x)
        binding.mainPressureTv.text = "1023 hPa"
        binding.mainHumidityTv.text = "26 %"
        binding.mainWindSpeedTv.text = "10 m/s"
        binding.mainSunsetTv.text = "6:30"
        binding.mainSunriseTv.text = "21:40"
        binding.mainIconWeatherConditionDescripton.text = "Clear sky"
    }
}