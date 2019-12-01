package apprentice

import java.lang.IllegalArgumentException

fun main() {
    /*
    Given positive integer n implement a function which returns a list numbers from 1 to 100.
    * However for multiples of three list should contain word Fizz instead of the number and for the multiples of five
    * list should contain word Buzz.
    * For numbers which are multiples of both three and five list should contain FizzBuzz word.*/

    println(fizzBuzz(5)) // [1, 2, "Fizz", 4, "Buzz"]

    println(fizzBuzz(16)) // [1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"
}

fun fizzBuzz(number: Int): List<String> {

    if (number > 100) {
        return throw IllegalArgumentException("Number greater than 100")
    }

    val three = "Fizz"
    val five = "Buzz"
    val both = "$three$five"

    val list = mutableListOf<String>()
    for (i in 1..number) {
        val content =
            if (i % 3 == 0 && i % 5 == 0) {
                both
            } else if (i % 3 == 0) {
                three
            } else if (i % 5 == 0) {
                five
            } else {
                i.toString()
            }

        list.add(content)
    }

    return list
}
