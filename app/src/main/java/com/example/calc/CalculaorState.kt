package com.example.calc

data class CalculaorState(
    val number1 : String = "",
    val number2 : String = "",
    val operation: CalculatorOperation ?= null
)
