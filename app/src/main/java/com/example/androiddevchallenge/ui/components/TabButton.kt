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
