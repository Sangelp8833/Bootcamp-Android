package com.sangelp.ciclosyotrascositas

class Dice(val numSides: Int = 6 )
{
    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }

    fun generateLuckyNumber(): Int{
        val luckyNumber = (1..6).random()
        return luckyNumber
    }
}