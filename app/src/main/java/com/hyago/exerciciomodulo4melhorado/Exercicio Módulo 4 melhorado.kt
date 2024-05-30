package com.hyago.exerciciomodulo4melhorado

fun main() {

    var mySum = soma(5,10)
    println(mySum)

    var myMultiply = multiply(5,10)
    println(myMultiply)

    println(calculator(2,10,::soma))
    println(calculator(2,10,::multiply))



}

fun soma(val1: Int, val2: Int) : Int {
    return val1 + val2
}

fun multiply(number1: Int, number2: Int) = number1 * number2

fun calculator(argument1: Int, argument2: Int, operation: (Int, Int) -> Int): Int{
    return operation(argument1, argument2)
}