package apprentice

fun main() {

    /*Given string implement a function, which returns the number of vowels used in a string.
    Vowels are the characters a, e i, o, u and y.*/

    vowels("Hi There!") // 3
    vowels("Why do you ask?") // 4
    vowels("Why?") // 0
}

fun vowels(string: String): Int {
    val vows = "aeiou"
    return string.count { it in vows }
}
