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

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun LoginField(
    modifier: Modifier = Modifier,
    placeholder: String,
    iconImageVector: ImageVector,
    isPassword: Boolean = false
) {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier = modifier
            .height(64.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        textStyle = typography.body1,
        singleLine = true,
        value = text,
        onValueChange = { text = it },
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = colors.onSurface,
            placeholderColor = colors.onSurface,
            leadingIconColor = colors.onSurface,
            unfocusedBorderColor = colors.onSurface
        ),
        placeholder = {
            Text(
                text = placeholder,
                style = typography.body1
            )
        },
        leadingIcon = {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = iconImageVector,
                contentDescription = "$placeholder icon"
            )
        }
    )
}
