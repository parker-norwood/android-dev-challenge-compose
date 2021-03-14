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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun FilterChip(text: String, iconImageVector: ImageVector?) {
    OutlinedButton(
        modifier = Modifier
            .height(40.dp)
            .padding(horizontal = 8.dp),
        shape = shapes.large,
        onClick = { /*TODO*/ },
        elevation = null,
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Transparent,
        ),
        border = BorderStroke(ButtonDefaults.OutlinedBorderSize, colors.onBackground)
    ) {
        Text(text = text, style = typography.body1, color = colors.onBackground)
        iconImageVector?.let {
            Icon(
                modifier = Modifier.size(16.dp),
                imageVector = iconImageVector,
                contentDescription = "$text filter",
                tint = colors.onBackground
            )
        }
    }
}
