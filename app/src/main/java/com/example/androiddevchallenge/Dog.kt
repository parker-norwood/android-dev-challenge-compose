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
package com.example.androiddevchallenge

data class Dog(
    val id: Int,
    val name: String,
    val breed: String,
    val age: Int,
    val isMonths: Boolean,
    val sex: Sex,
    val imageId: Int,
    val weight: Int,
    val size: Size,
    val isFixed: Boolean,
    val hasShots: Boolean,
    val characteristics: List<String>
) {
    enum class Sex(val text: String) {
        MALE("Male"),
        FEMALE("Female")
    }

    enum class Size(val text: String) {
        SMALL("Small"),
        MEDIUM("Medium"),
        LARGE("Large")
    }
}
