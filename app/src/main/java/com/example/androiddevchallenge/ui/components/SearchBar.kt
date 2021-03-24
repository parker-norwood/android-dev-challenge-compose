package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.isFocused
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.shapes

@Composable
fun SearchBar() {
    val focusRequester = FocusRequester()
    var text by remember { mutableStateOf("") }

    @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
    var isFocused by remember { mutableStateOf(false) }

    Surface(modifier = Modifier.padding(4.dp), shape = shapes.small, elevation = 1.dp) {
        OutlinedTextField(
            modifier = Modifier
                .padding(4.dp)
                .focusRequester(focusRequester)
                .onFocusChanged { isFocused = it.isFocused }
                .fillMaxWidth(),
            singleLine = true,
            value = text,
            onValueChange = { text = it },
            placeholder = { Text(text = "Search places") },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search places"
                )
            }
        )
    }

}