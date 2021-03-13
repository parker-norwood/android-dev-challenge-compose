package com.example.androiddevchallenge.mock

data class Stock(
    val amount: Double,
    val percentChange: Double,
    val ticker: String,
    val assetName: String,
    val imageId: Int
) {
    fun amountString(): String {
        return "$" + "%,.2f".format(amount)
    }

    fun percentChangeString(): String {
        return (if (percentChange > 0) "+" else "") + "%,.2f".format(percentChange) + "%"
    }
}
