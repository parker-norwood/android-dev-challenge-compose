package com.example.androiddevchallenge.data.model

import com.example.androiddevchallenge.R

enum class WeatherType(val displayText: String, val iconId: Int) {
    CLEAR("Clear", R.drawable.iconfinder_sun_2995005),
    PARTLY_CLOUDY("Partly Cloudy", R.drawable.iconfinder_cloudy_2995001),
    MOSTLY_CLOUDY("Mostly Cloudy", R.drawable.iconfinder_cloudy_2995001),
    CLOUDY("Cloudy", R.drawable.iconfinder_cloud_2995000),
    RAIN("Rain", R.drawable.iconfinder_rain_cloud_2995003),
    SNOW("Snow", R.drawable.iconfinder_snow_cloud_2995007),
    STORMY("Stormy", R.drawable.iconfinder_flash_cloud_2995010)
}