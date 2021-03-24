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
package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.mock.MockDayForecast
import com.example.androiddevchallenge.data.model.ForecastDay

@Composable
fun DayForecastScreen() {
    val dayForecast: ForecastDay = MockDayForecast
    Column {
        Row {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                Column {
                    Text(
                        text = dayForecast.location,
                        fontSize = 24.sp,
                        modifier = Modifier.padding(
                            start = 8.dp,
                            end = 8.dp,
                            top = 8.dp,
                            bottom = 4.dp
                        )
                    )
                    Text(
                        text = dayForecast.date,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(
                            start = 8.dp,
                            end = 8.dp,
                            top = 4.dp,
                            bottom = 8.dp
                        )
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .height(196.dp)
                .padding(top = 8.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp, end = 4.dp)
                    .fillMaxHeight()
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(fontSize = 96.sp)
                            ) {
                                append(dayForecast.forecast[12].temperature.toString())
                            }

                            withStyle(
                                style = SpanStyle(
                                    fontSize = 32.sp,
                                    baselineShift = BaselineShift(3f),
                                )
                            ) {
                                append("℉")
                            }
                        },
                        textAlign = TextAlign.Center
                    )
                    Row {
                        Text(
                            text = "${dayForecast.high}℉ ↑",
                            modifier = Modifier.weight(1f),
                            textAlign = TextAlign.Center,
                            fontSize = 24.sp
                        )
                        Text(
                            text = "${dayForecast.low}℉ ↓",
                            modifier = Modifier.weight(1f),
                            textAlign = TextAlign.Center,
                            fontSize = 24.sp
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 4.dp, end = 8.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        modifier = Modifier.weight(8f),
                        painter = painterResource(id = dayForecast.forecast[12].weather.iconId),
                        contentDescription = "Snow"
                    )
                    Text(
                        text = dayForecast.forecast[12].weather.displayText,
                        modifier = Modifier.weight(2f),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        LazyRow(
            contentPadding = PaddingValues(start = 8.dp, end = 8.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            items(dayForecast.forecast) {
                Card {
                    Column(
                        modifier = Modifier.padding(vertical = 8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "${it.temperature}℉", textAlign = TextAlign.Center)
                        Image(
                            modifier = Modifier.size(64.dp),
                            painter = painterResource(id = it.weather.iconId),
                            contentDescription = it.weather.displayText
                        )
                        Text(text = it.time, textAlign = TextAlign.Center)
                    }
                }
            }
        }
    }
}
