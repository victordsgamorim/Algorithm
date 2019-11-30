package apprentice

fun main() {

    /*Given a string, return true if the string is a palindrome or false if it is not.
    Palindromes are strings that form the same word if it is reversed.
    Include spaces and punctuation in determining if the string is a palindrome.*/

    isPalindrome("abba")// true
    isPalindrome("abcdefg") // false
}

fun isPalindrome(string: String) = string == string.reversed()
