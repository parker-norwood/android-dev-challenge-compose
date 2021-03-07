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
package com.example.androiddevchallenge

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.style.TextAlign
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    val timerViewModel: TimerViewModel = viewModel()
    val time by timerViewModel.time.observeAsState()
    val isRunning by timerViewModel.isRunning.observeAsState()
    val focusManager = LocalFocusManager.current
    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(text = "Countdown Timer ⏳") })
                }
            ) {
                Column(
                    Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    var text by remember { mutableStateOf("") }
                    time?.let {
                        Row(
                            modifier = Modifier
                                .weight(9f),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                style = MaterialTheme.typography.h3,
                                // @formatter:off
                                text = "${(it / (60 * 60 * 1000)).toString().padStart(2, '0')}h " +
                                    "${
                                    ((it / (60 * 1000)) % 60).toString().padStart(2, '0')
                                    }m " +
                                    "${((it / 1000) % 60).toString().padStart(2, '0')}s",
                                // @formatter:on
                            )
                        }
                    }
                    TextField(
                        modifier = Modifier
                            .weight(1.3f)
                            .fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                timerViewModel.setTimeFromString(text)
                                if (isRunning == true) {
                                    timerViewModel.stopTimer()
                                } else timerViewModel.startTimer()
                                focusManager.clearFocus()
                            }
                        ),
                        singleLine = true,
                        enabled = isRunning == false,
                        value = text,
                        visualTransformation = {
                            val tmp = it.padStart(6, '0')
                            TransformedText(
                                AnnotatedString(
                                    // @formatter:off
                                    "${tmp.substring(0, 2)}h ${
                                    tmp.substring(
                                        2,
                                        4
                                    )
                                    }m ${tmp.substring(4, 6)}s"
                                    // @formatter:on
                                ),
                                OffsetMapping.Identity
                            )
                        },
                        placeholder = { Text(text = "00h 00m 00s") },
                        onValueChange = {
                            text = if (it.matches(Regex("^([0-9]){0,6}$"))) it else text
                        },
                    )
                    Button(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth(),
                        onClick = {
                            timerViewModel.setTimeFromString(text)
                            if (isRunning == true) {
                                timerViewModel.stopTimer()
                            } else timerViewModel.startTimer()
                            focusManager.clearFocus()
                        }
                    ) {
                        Text(text = if (isRunning == true) "Stop" else "Start")
                    }
                }
            }
        }
    }
}
