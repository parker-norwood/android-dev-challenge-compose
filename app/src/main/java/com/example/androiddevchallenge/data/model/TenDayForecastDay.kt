package com.example.androiddevchallenge.data.model

data class TenDayForecastDay(
    val date: String,
    val weather: WeatherType,
    val high: Int,
    val low: Int
)
