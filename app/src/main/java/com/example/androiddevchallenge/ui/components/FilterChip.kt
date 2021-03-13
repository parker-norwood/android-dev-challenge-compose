package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
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