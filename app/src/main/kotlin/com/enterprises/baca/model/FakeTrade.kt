package com.enterprises.baca.model

data class FakeTrade(
    val symbol: String,
    val price: Double,
    val volume: Int,
    val timestamp: Long,
)
