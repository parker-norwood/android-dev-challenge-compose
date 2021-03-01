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
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.*
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
    val navController = rememberNavController()
    val dogs = MockDogs.dogs

    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(text = "Adopt a \uD83D\uDC36") })
                }
            ) {
                NavHost(navController = navController, startDestination = "dogFeed") {
                    composable("dogFeed") { DogFeed(navController = navController, dogs = dogs) }
                    composable(
                        "dogProfile/{id}",
                        arguments = listOf(navArgument("id") { type = NavType.IntType })
                    ) { backStackEntry ->
                        DogProfile(dog = dogs[backStackEntry.arguments?.getInt("id")!!])
                    }
                }
            }
        }
    }
}

@Composable
fun DogFeed(navController: NavController, dogs: List<Dog>) {
    val scrollState = rememberLazyListState()
    LazyColumn(state = scrollState) {
        items(dogs) { dog ->
            DogCard(
                dog = dog,
                onClick = { navController.navigate("dogProfile/${dog.id}") }
            )
        }
    }
}

@Composable
fun DogCard(dog: Dog, onClick: () -> Unit) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick),
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
                    Icon(
                        imageVector = if (dog.sex == Dog.Sex.MALE) Icons.Filled.Male else Icons.Filled.Female,
                        contentDescription = dog.sex.text
                    )
                }
                Text(
                    text = "${dog.age} ${if (dog.isMonths) "month" else "year"}${if (dog.age > 1) "s" else ""} old",
                    style = MaterialTheme.typography.body1,
                )
            }
        }
    }
}

@Composable
fun DogProfile(dog: Dog) {

    @Composable
    fun SideBySideText(leftText: String, rightText: String) {
        Row {
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 12.dp),
                style = MaterialTheme.typography.h6,
                text = leftText
            )
            Text(
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.h6,
                text = rightText
            )
        }
    }

    Column {
        Image(
            painter = painterResource(dog.imageId),
            contentDescription = null,
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(bottomStart = 4.dp, bottomEnd = 4.dp)),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(12.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = dog.name, style = MaterialTheme.typography.h4)
            Column(modifier = Modifier.padding(12.dp)) {
                Text(text = "Attributes", style = MaterialTheme.typography.h5)
                Spacer(Modifier.size(12.dp))
                SideBySideText(
                    leftText = "Breed",
                    rightText = dog.breed
                )
                Row {
                    Text(
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 12.dp),
                        style = MaterialTheme.typography.h6,
                        text = "Sex"
                    )
                    Row(modifier = Modifier.weight(1f)) {
                        Text(
                            style = MaterialTheme.typography.h6,
                            text = dog.sex.text
                        )
                        Icon(
                            imageVector = if (dog.sex == Dog.Sex.MALE) Icons.Filled.Male else Icons.Filled.Female,
                            contentDescription = dog.sex.text
                        )
                    }
                }
                SideBySideText(
                    leftText = "Age",
                    rightText = "${dog.age} ${if (dog.isMonths) "month" else "year"}${if (dog.age > 1) "s" else ""} old"
                )
                SideBySideText(
                    leftText = "Weight",
                    rightText = "${dog.weight} lbs"
                )
                SideBySideText(
                    leftText = "Size",
                    rightText = dog.size.text
                )
                Spacer(Modifier.size(12.dp))
                Text(text = "Health", style = MaterialTheme.typography.h5)
                Spacer(Modifier.size(12.dp))
                SideBySideText(
                    leftText = if (dog.sex == Dog.Sex.MALE) "Neutered" else "Spayed",
                    rightText = if (dog.isFixed) "YES" else "NO"
                )
                SideBySideText(
                    leftText = "Shots up to date",
                    rightText = if (dog.hasShots) "YES" else "NO"
                )
                Spacer(Modifier.size(12.dp))
                Text(text = "Characteristics", style = MaterialTheme.typography.h5)
                Spacer(Modifier.size(12.dp))
                Row {
                    dog.characteristics.forEach { characteristic ->
                        Text(
                            text = characteristic,
                            modifier = Modifier
                                .background(
                                    color = MaterialTheme.colors.primary,
                                    shape = RoundedCornerShape(50)
                                )
                                .padding(8.dp)
                        )
                        Spacer(Modifier.size(4.dp))
                    }
                }
            }
        }
    }
}
