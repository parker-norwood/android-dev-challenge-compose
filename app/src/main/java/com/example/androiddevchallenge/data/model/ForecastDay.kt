package com.example.androiddevchallenge.data.model

data class ForecastDay(
    val location: String,
    val date: String,
    val forecast: List<ForecastHour>
) {
    val high = forecast.maxByOrNull { it.temperature }?.temperature
    val low = forecast.minByOrNull { it.temperature }?.temperature

    data class ForecastHour(
        val temperature: Int,
        val weather: WeatherType,
        val time: String
    )
}