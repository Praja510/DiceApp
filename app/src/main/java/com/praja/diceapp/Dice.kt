package com.praja.diceapp

class Dice(val value: Int) {
    fun roll(): Int{
        return (1..value).random()
    }
}