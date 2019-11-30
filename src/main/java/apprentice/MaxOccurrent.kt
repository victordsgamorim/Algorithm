package apprentice

import java.lang.IllegalArgumentException

fun main() {

    /*Given a string implement a function which returns the character
    that is most commonly used in that string.*/

    maxChar("abcccccccd") // "c"
    maxChar("apple 1231111") // "1"
}

fun maxChar(string: String): Char {
    return string
        .filter { it.isLetterOrDigit() }
        .groupingBy { it }
        .eachCount()
        .maxBy { it.value }
        ?.let { it.key }
        ?: throw IllegalArgumentException("No string as input")
}