package easy

import java.util.*

fun main() {

    /*Given positive integer n implement a function, which returns a factorial of that integer.
    Factorial (of positive integer) is number that is created by multiplying all numbers from 1 to n eg.
    factorial of 3 (3!) is equal to 6 (3 * 2 * 1)*/

    factorial(1) // 1
    factorial(2) // 2
    factorial(3) // 6

    recusiveFactorial(6)
}

fun factorial(number: Int): Int {

    if (number == 1) return 1

    val list = mutableListOf<Int>()

    for (i in number downTo 1) {
        list.add(i)
    }

    var index = 1
    var result = 0

    while (index < list.size) {
        if (result == 0) {
            result = list[index] * list[index - 1]
        } else {
            result *= list[index]
        }
        index++
    }
    return result
}

private fun recusiveFactorial(number: Int): Int {

    if (number == 0) {
        return 1
    }

    return number * recusiveFactorial(number - 1)
}