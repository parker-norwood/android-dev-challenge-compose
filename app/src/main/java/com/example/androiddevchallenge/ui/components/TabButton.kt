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

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.typography
import java.util.Locale

@Composable
fun TabButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isDisabled: Boolean = false
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .padding(horizontal = 8.dp)
            .height(48.dp),
        shape = shapes.large,
        elevation = null,
        colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Transparent),
        enabled = !isDisabled
    ) {
        Text(
            text = text.toUpperCase(Locale.getDefault()),
            color = if (isDisabled) Color.Gray else colors.onBackground,
            style = typography.button
        )
    }
}
