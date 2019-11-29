package easy

import java.lang.StringBuilder

fun main() {
/* Given a string implement a function which capitalizes first letter of every word in that string.*/
    println("flower".capitalizeSentence())
    println("this is a house".capitalizeSentence())

}

private fun String.capitalizeSentence(): String {

    val split = this.split(" ").toMutableList()

    for (i in split.indices) {
        val word = split[i]
        split[i] = "${word[0].toUpperCase()}${word.substring(1 until word.length)}"
    }

    val builder = StringBuilder()
    for (i in split) {
        if (split.indexOf(i) != split.size - 1) builder.append("$i ") else builder.append("$i")
    }

    return builder.toString()
}