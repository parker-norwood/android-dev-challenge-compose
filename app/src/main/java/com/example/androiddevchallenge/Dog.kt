package com.example.androiddevchallenge

data class Dog(
    val id: Int,
    val name: String,
    val breed: String,
    val age: Int,
    val isMonths: Boolean,
    val sex: Sex,
    val imageId: Int,
    val weight: Int,
    val size: Size,
    val isFixed: Boolean,
    val hasShots: Boolean,
    val characteristics: List<String>
) {
    enum class Sex(val text: String) {
        MALE("Male"),
        FEMALE("Female")
    }

    enum class Size(val text: String) {
        SMALL("Small"),
        MEDIUM("Medium"),
        LARGE("Large")
    }
}
