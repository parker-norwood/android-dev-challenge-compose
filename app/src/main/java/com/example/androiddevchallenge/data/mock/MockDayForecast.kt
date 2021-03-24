/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data.mock

import com.example.androiddevchallenge.data.model.ForecastDay
import com.example.androiddevchallenge.data.model.ForecastDay.ForecastHour
import com.example.androiddevchallenge.data.model.WeatherType

val MockDayForecast: ForecastDay = ForecastDay(
    "New York, New York",
    "March 23, 2021",
    listOf(
        ForecastHour(41, WeatherType.CLEAR, "12 AM"),
        ForecastHour(41, WeatherType.CLEAR, "1 AM"),
        ForecastHour(40, WeatherType.CLEAR, "2 AM"),
        ForecastHour(42, WeatherType.CLEAR, "3 AM"),
        ForecastHour(41, WeatherType.CLEAR, "4 AM"),
        ForecastHour(41, WeatherType.CLEAR, "5 AM"),
        ForecastHour(41, WeatherType.CLEAR, "6 AM"),
        ForecastHour(42, WeatherType.CLEAR, "7 AM"),
        ForecastHour(47, WeatherType.PARTLY_CLOUDY, "8 AM"),
        ForecastHour(53, WeatherType.PARTLY_CLOUDY, "9 AM"),
        ForecastHour(57, WeatherType.PARTLY_CLOUDY, "10 AM"),
        ForecastHour(61, WeatherType.MOSTLY_CLOUDY, "11 AM"),
        ForecastHour(63, WeatherType.MOSTLY_CLOUDY, "12 PM"),
        ForecastHour(64, WeatherType.MOSTLY_CLOUDY, "1 PM"),
        ForecastHour(66, WeatherType.MOSTLY_CLOUDY, "2 PM"),
        ForecastHour(65, WeatherType.CLOUDY, "3 PM"),
        ForecastHour(65, WeatherType.CLOUDY, "4 PM"),
        ForecastHour(64, WeatherType.CLOUDY, "5 PM"),
        ForecastHour(62, WeatherType.CLOUDY, "6 PM"),
        ForecastHour(59, WeatherType.CLOUDY, "7 PM"),
        ForecastHour(57, WeatherType.MOSTLY_CLOUDY, "8 PM"),
        ForecastHour(55, WeatherType.MOSTLY_CLOUDY, "9 PM"),
        ForecastHour(54, WeatherType.MOSTLY_CLOUDY, "10 PM"),
        ForecastHour(52, WeatherType.CLOUDY, "11 PM")
    )
)

@Suppress("unused")
val MockTomorrowForecast: ForecastDay = ForecastDay(
    "New York, New York",
    "March 24, 2021",
    listOf(
        ForecastHour(49, WeatherType.RAIN, "12 AM"),
        ForecastHour(49, WeatherType.RAIN, "1 AM"),
        ForecastHour(49, WeatherType.RAIN, "2 AM"),
        ForecastHour(50, WeatherType.RAIN, "3 AM"),
        ForecastHour(51, WeatherType.RAIN, "4 AM"),
        ForecastHour(51, WeatherType.RAIN, "5 AM"),
        ForecastHour(52, WeatherType.RAIN, "6 AM"),
        ForecastHour(52, WeatherType.RAIN, "7 AM"),
        ForecastHour(52, WeatherType.RAIN, "8 AM"),
        ForecastHour(52, WeatherType.RAIN, "9 AM"),
        ForecastHour(53, WeatherType.RAIN, "10 AM"),
        ForecastHour(52, WeatherType.RAIN, "11 AM"),
        ForecastHour(51, WeatherType.RAIN, "12 PM"),
        ForecastHour(51, WeatherType.RAIN, "1 PM"),
        ForecastHour(51, WeatherType.RAIN, "2 PM"),
        ForecastHour(51, WeatherType.RAIN, "3 PM"),
        ForecastHour(51, WeatherType.RAIN, "4 PM"),
        ForecastHour(51, WeatherType.RAIN, "5 PM"),
        ForecastHour(51, WeatherType.RAIN, "6 PM"),
        ForecastHour(51, WeatherType.RAIN, "7 PM"),
        ForecastHour(51, WeatherType.CLOUDY, "8 PM"),
        ForecastHour(51, WeatherType.RAIN, "9 PM"),
        ForecastHour(51, WeatherType.RAIN, "10 PM"),
        ForecastHour(51, WeatherType.RAIN, "11 PM")
    )
)
