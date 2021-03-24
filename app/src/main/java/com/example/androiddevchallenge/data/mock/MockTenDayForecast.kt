package com.example.androiddevchallenge.data.mock

import com.example.androiddevchallenge.data.model.TenDayForecastDay
import com.example.androiddevchallenge.data.model.WeatherType

val MockTenDayForecast: List<TenDayForecastDay> = listOf(
    TenDayForecastDay("March 23, 2021", WeatherType.RAIN, 56, 39),
    TenDayForecastDay("March 24, 2021", WeatherType.SNOW, 32, 24),
    TenDayForecastDay("March 25, 2021", WeatherType.CLEAR, 32, 24),
    TenDayForecastDay("March 26, 2021", WeatherType.CLOUDY, 40, 34),
    TenDayForecastDay("March 27, 2021", WeatherType.MOSTLY_CLOUDY, 39, 20),
    TenDayForecastDay("March 28, 2021", WeatherType.PARTLY_CLOUDY, 30, 19),
    TenDayForecastDay("March 29, 2021", WeatherType.STORMY, 50, 34),
    TenDayForecastDay("March 31, 2021", WeatherType.CLEAR, 55, 30),
    TenDayForecastDay("April 1, 2021", WeatherType.RAIN, 37, 29),
    TenDayForecastDay("April 2, 2021", WeatherType.CLEAR, 50, 43),
)