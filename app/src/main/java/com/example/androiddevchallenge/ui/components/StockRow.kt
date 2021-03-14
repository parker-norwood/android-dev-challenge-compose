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
package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.mock.Stock
import com.example.androiddevchallenge.ui.theme.green
import com.example.androiddevchallenge.ui.theme.red
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun StockRow(stock: Stock) {
    Divider(thickness = 1.dp)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(text = stock.amountString(), style = typography.body1)
            Text(
                text = stock.percentChangeString(),
                style = typography.body1,
                color = if (stock.percentChange > 0) green else red
            )
        }
        Column(modifier = Modifier.weight(2f)) {
            Text(text = stock.ticker, style = typography.h3)
            Text(text = stock.assetName, style = typography.body1)
        }
        Column(modifier = Modifier.weight(1f)) {
            Image(
                painter = painterResource(id = stock.imageId),
                contentDescription = "${stock.ticker} Chart"
            )
        }
    }
}
