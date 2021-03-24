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
