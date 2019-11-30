package apprentice

fun main() {

    /*Given a string, return true if the string is a palindrome or false if it is not.
    Palindromes are strings that form the same word if it is reversed.
    Include spaces and punctuation in determining if the string is a palindrome.
    In this exercise we will allows one bad character. Our string will be (tolerant)
    palindrome if after removing one character string is a palindrome.*/


    println(tolerantPalindrome("abba")) // true

    println(tolerantPalindrome("abb#a")) // true

    println(tolerantPalindrome("abcdefg")) // false
}

fun tolerantPalindrome(string: String): Boolean {
    val letters = mutableListOf<Char>()

    for (i in string) {
        if (i in 'a'..'z') {
            letters.add(i)
        }
    }
    return letters == letters.reversed()
}
