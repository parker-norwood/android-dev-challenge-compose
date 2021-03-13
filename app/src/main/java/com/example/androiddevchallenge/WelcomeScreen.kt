package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.purple

@Composable
fun WelcomeScreen() {
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        color = purple
    ) {
        Image(
            painter = painterResource(id = R.drawable.welcome_bg),
            contentDescription = "Welcome Background",
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.FillBounds,
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "WeTrade logo",
            )
        }
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Row(modifier = Modifier.padding(bottom = 32.dp)) {
                CustomButton(
                    modifier = Modifier.weight(1f),
                    text = "Get Started",
                    onClick = { /* TODO */ }
                )
                CustomButton(
                    modifier = Modifier.weight(1f),
                    text = "Log In",
                    onClick = { /* TODO */ },
                    isInverse = true
                )
            }
        }
    }
}