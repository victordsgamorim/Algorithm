package easy

import kotlin.math.pow

fun main() {
    /*Given positive integer n implement a function which calculates
    sum of all numbers from 1 up to (and including) number n.*/

    println(addUpTo(1)) // 1

    println(addUpTo(2)) // 3

    println(addUpTo(3)) // 6

    val pow = 9.0.pow(8.0).toLong()

    println(pow)

}

fun addUpTo(number: Int)= (0..number).sum()

