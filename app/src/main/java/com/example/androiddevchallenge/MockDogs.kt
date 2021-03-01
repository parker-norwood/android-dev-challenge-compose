package com.example.androiddevchallenge

object MockDogs {
    val dogs: List<Dog> = listOf(
        Dog(
            id = 0,
            name = "Pupper",
            breed = "Rottweiler",
            age = 7,
            isMonths = true,
            sex = Dog.Sex.MALE,
            imageId = R.drawable.pexels_dominika_roseclay_2023384,
            weight = 8,
            size = Dog.Size.SMALL,
            isFixed = false,
            hasShots = true,
            characteristics = listOf("Timid")
        ),
        Dog(
            id = 1,
            name = "Shoop",
            breed = "Samoyed",
            age = 1,
            isMonths = false,
            sex = Dog.Sex.FEMALE,
            imageId = R.drawable.pexels_helena_lopes_4453055,
            weight = 30,
            size = Dog.Size.MEDIUM,
            isFixed = true,
            hasShots = true,
            characteristics = listOf("Friendly", "Loud")
        ),
        Dog(
            id = 2,
            name = "Darth Shibe",
            breed = "Shiba Inu",
            age = 2,
            isMonths = false,
            sex = Dog.Sex.MALE,
            imageId = R.drawable.pexels_sean_siow_6495165,
            weight = 35,
            size = Dog.Size.MEDIUM,
            isFixed = true,
            hasShots = true,
            characteristics = listOf("Loyal", "Aggressive")
        ),
        Dog(
            id = 3,
            name = "Snow Doggo",
            breed = "Siberian Husky",
            age = 4,
            isMonths = false,
            sex = Dog.Sex.MALE,
            imageId = R.drawable.pexels_kateryna_babaieva_3715587,
            weight = 55,
            size = Dog.Size.LARGE,
            isFixed = true,
            hasShots = true,
            characteristics = listOf("Howls")
        )
    )
}