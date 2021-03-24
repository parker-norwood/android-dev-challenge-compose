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
