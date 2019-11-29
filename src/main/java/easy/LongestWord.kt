package easy

fun main() {

    /*Given a string implement a function which returns longest word in that string.
    If there are two or more words that have the same length, return the first longest word from the string.
    Ignore punctuation. Input string can't be empty or blank sering.*/

    println(longestWord("big flower")) // flower
    println(longestWord("this is a house")) // house

}

fun longestWord(string: String): String {
    val split = string.split(" ")
    return split[split.indexOf(split.maxBy { it.length })]
}
