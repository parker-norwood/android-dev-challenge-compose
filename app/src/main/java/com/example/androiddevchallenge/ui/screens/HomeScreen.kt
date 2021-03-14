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
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.mock.stocks
import com.example.androiddevchallenge.ui.components.ActionButton
import com.example.androiddevchallenge.ui.components.FilterChip
import com.example.androiddevchallenge.ui.components.StockRow
import com.example.androiddevchallenge.ui.components.TabButton
import com.example.androiddevchallenge.ui.theme.green
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun HomeScreen() {
    val filters: List<String> = listOf("Week", "ETF", "Stocks", "Funds", "Crypto", "Options")
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Surface(
            color = colors.background
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                ) {
                    TabButton(text = "Account", onClick = { })
                    TabButton(text = "Watchlist", onClick = { }, isDisabled = true)
                    TabButton(text = "Profile", onClick = { }, isDisabled = true)
                }
                Text(
                    modifier = Modifier.padding(bottom = 8.dp),
                    text = "Balance",
                    textAlign = TextAlign.Center,
                    style = typography.subtitle1
                )
                Text(
                    modifier = Modifier.padding(bottom = 24.dp),
                    text = "$73,589.01",
                    textAlign = TextAlign.Center,
                    style = typography.h1
                )
                Text(
                    modifier = Modifier.padding(bottom = 32.dp),
                    text = "+412.35 today",
                    textAlign = TextAlign.Center,
                    style = typography.subtitle1,
                    color = green
                )
                ActionButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    text = "Transact",
                    onClick = { }
                )
                Row(modifier = Modifier.horizontalScroll(rememberScrollState()).padding(bottom = 16.dp)) {
                    filters.forEach {
                        FilterChip(
                            text = it,
                            iconImageVector = if (it == "Week") Icons.Filled.ExpandMore else null
                        )
                    }
                }
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp),
                    painter = painterResource(id = R.drawable.home_illos),
                    contentDescription = "Gain/Loss Chart"
                )
            }
        }
        Surface(
            color = colors.surface
        ) {
            Column(
                modifier = Modifier
                    .absolutePadding(left = 16.dp, right = 16.dp, top = 16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 24.dp),
                    text = "Positions",
                    textAlign = TextAlign.Center,
                    style = typography.subtitle1
                )
                stocks.forEach { stock ->
                    StockRow(stock)
                }
            }
        }
    }
}
