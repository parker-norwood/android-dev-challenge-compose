package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.background
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun LoginField(
    modifier: Modifier = Modifier,
    placeholder: String,
    iconImageVector: ImageVector
) {
    OutlinedTextField(
        modifier = modifier
            .height(64.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        textStyle = typography.body1,
        singleLine = true,
        value = "",
        onValueChange = { /*TODO*/ },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = colors.onPrimary,
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