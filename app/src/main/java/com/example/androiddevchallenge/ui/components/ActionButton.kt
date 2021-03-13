package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.typography
import java.util.Locale

@Composable
fun ActionButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isInverse: Boolean = false
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier
            .padding(horizontal = 8.dp)
            .height(48.dp),
        shape = shapes.large,
        elevation = null,
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = if (isInverse) Color.Transparent else colors.primary,
            ),
        border = BorderStroke(ButtonDefaults.OutlinedBorderSize, colors.primary)
    ) {
        Text(
            text = text.toUpperCase(Locale.getDefault()),
            color = if (isInverse) colors.primary else colors.onPrimary,
            style = typography.button
        )
    }
}
