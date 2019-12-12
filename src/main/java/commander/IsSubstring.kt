package commander

fun main() {

/*Given two strings implement a function which determines whether the characters in the second string is
a substring of the characters in the first string (check if second string exists as continuous/unbroken
chain of characters the first string).*/


    println(isSubstring("go home", "ome")) // true

    println(isSubstring("go home", "me")) // true

    println(isSubstring("go home", "abc")) // false

}

fun isSubstring(string: String, substring: String): Boolean {
    val end = substring.length

    for (i in string.indices) {
        if ((i + end) > string.length) return false
        val sub = string.substring(i, i + end)
        if (sub == substring) return true
    }


    return false
}