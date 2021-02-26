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
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            LazyColumn {
                item {
                    DogCard(
                        Dog(
                            name = "Pupper",
                            age = 7,
                            isMonths = true,
                            sex = Dog.Sex.MALE,
                            imageId = R.drawable.pexels_dominika_roseclay_2023384
                        )
                    )
                }

                item {
                    DogCard(
                        Dog(
                            name = "Shoop",
                            age = 1,
                            isMonths = false,
                            sex = Dog.Sex.FEMALE,
                            imageId = R.drawable.pexels_helena_lopes_4453055
                        )
                    )
                }

                item {
                    DogCard(
                        Dog(
                            name = "Darth Shibe",
                            age = 2,
                            isMonths = false,
                            sex = Dog.Sex.MALE,
                            imageId = R.drawable.pexels_sean_siow_6495165
                        )
                    )
                }

                item {
                    DogCard(
                        Dog(
                            name = "Snow Doggo",
                            age = 4,
                            isMonths = false,
                            sex = Dog.Sex.MALE,
                            imageId = R.drawable.pexels_kateryna_babaieva_3715587
                        )
                    )
                }
            }
        }
    }
}

class Dog(val name: String, val age: Int, val isMonths: Boolean, val sex: Sex, val imageId: Int) {
    enum class Sex(val sex: String) {
        MALE("male"),
        FEMALE("female")
    }
}

class Age(val age: Int, val isMonths: Boolean) {

}

@Composable
fun DogCard(dog: Dog) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 4.dp
    ) {
        Column {
            Image(
                painter = painterResource(dog.imageId),
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.padding(6.dp)
            ) {
                Row {
                    Text(
                        text = dog.name,
                        style = MaterialTheme.typography.h6,
                    )
                    if (dog.sex == Dog.Sex.MALE) Icon(
                        imageVector = Icons.Filled.Male,
                        contentDescription = Dog.Sex.MALE.name
                    ) else Icon(imageVector = Icons.Filled.Female, contentDescription = "female")
                }
                Text(
                    text = "${dog.age} ${if (dog.isMonths) "months" else "years"} old",
                    style = MaterialTheme.typography.body1,
                )
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
