package com.example.calcutor

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation( "+")
    object Subtract: CalculatorOperation( "-")
    object Multiple: CalculatorOperation( "x")
    object Divide: CalculatorOperation( "/")
}