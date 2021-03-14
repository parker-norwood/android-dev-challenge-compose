package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.components.ActionButton
import com.example.androiddevchallenge.ui.components.LoginField
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun LoginScreen(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(modifier = Modifier.padding(bottom = 40.dp), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.login_bg),
                    contentDescription = "Login Background",
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )
                Text(
                    text = "Welcome\nback",
                    style = typography.h2,
                    color = colors.onBackground,
                    textAlign = TextAlign.Center
                )
            }
            LoginField(
                modifier = Modifier.padding(bottom = 8.dp),
                placeholder = "Email address",
                iconImageVector = Icons.Outlined.Mail
            )
            LoginField(
                modifier = Modifier.padding(bottom = 16.dp),
                placeholder = "Password",
                iconImageVector = Icons.Filled.Password,
                isPassword = true
            )
            ActionButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                text = "Log In",
                onClick = { navController.navigate("homeScreen") }
            )
        }
    }
}