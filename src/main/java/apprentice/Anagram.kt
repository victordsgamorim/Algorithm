package apprentice

fun main() {


    /*
Given two strings, implement a function to determine if the second string is an anagram of the
first. An anagram is a word, phrase, or name formed by rearranging the letters of another,
such as cinema, formed from iceman. Only consider characters,
not spaces or punctuation. Consider capital letters to be the same as lower case.*/


    anagrams("rail safety", "fairy tales")
    anagrams("RAIL! SAFETY!", "fairy tales'")
    anagrams("Hi there", "Bye there")

}

private fun anagrams(string1: String, string2: String): Boolean {
    return getCharFrequency(string1) == getCharFrequency(string2)
}

private fun getCharFrequency(str: String): Map<Char, Int> {
    return str.toLowerCase()
        .filter { it.isLetterOrDigit() }
        .groupingBy { it }
        .eachCount()
}