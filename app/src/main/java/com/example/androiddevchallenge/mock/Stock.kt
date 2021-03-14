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

data class Stock(
    val amount: Double,
    val percentChange: Double,
    val ticker: String,
    val assetName: String,
    val imageId: Int
) {
    fun amountString(): String {
        return "$" + "%,.2f".format(amount)
    }

    fun percentChangeString(): String {
        return (if (percentChange > 0) "+" else "") + "%,.2f".format(percentChange) + "%"
    }
}
