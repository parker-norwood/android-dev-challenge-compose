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
package com.example.androiddevchallenge.mock

import com.example.androiddevchallenge.R

val stocks: List<Stock> = listOf(
    Stock(
        amount = 7918.0,
        percentChange = -0.54,
        ticker = "ALK",
        assetName = "Alaska Air Group, Inc.",
        imageId = R.drawable.home_alk
    ),
    Stock(
        amount = 1293.0,
        percentChange = 4.18,
        ticker = "BA",
        assetName = "Boeing, Co.",
        imageId = R.drawable.home_ba
    ),
    Stock(
        amount = 893.50,
        percentChange = -0.54,
        ticker = "DAL",
        assetName = "Delta Airlines Inc.",
        imageId = R.drawable.home_dal
    ),
    Stock(
        amount = 12301.0,
        percentChange = 2.51,
        ticker = "EXPE",
        assetName = "Expedia Group Inc.",
        imageId = R.drawable.home_exp
    ),
    Stock(
        amount = 12301.0,
        percentChange = 1.38,
        ticker = "EADSY",
        assetName = "Airbus SE",
        imageId = R.drawable.home_eadsy
    ),
    Stock(
        amount = 8521.0,
        percentChange = 1.56,
        ticker = "JBLU",
        assetName = "Jetblue Airways Corp.",
        imageId = R.drawable.home_jblu
    ),
    Stock(
        amount = 521.0,
        percentChange = 2.75,
        ticker = "MAR",
        assetName = "Marriott International Inc.",
        imageId = R.drawable.home_mar
    ),
    Stock(
        amount = 5481.0,
        percentChange = 0.14,
        ticker = "CCL",
        assetName = "Carnival Corp",
        imageId = R.drawable.home_ccl
    ),
    Stock(
        amount = 9184.0,
        percentChange = 1.69,
        ticker = "RCL",
        assetName = "Royal Caribbean Cruises",
        imageId = R.drawable.home_rcl
    ),
    Stock(
        amount = 654.0,
        percentChange = 3.23,
        ticker = "TRVL",
        assetName = "Travelocity Inc.",
        imageId = R.drawable.home_trvl
    )
)
