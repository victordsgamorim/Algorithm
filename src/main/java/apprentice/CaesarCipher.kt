package apprentice

import java.lang.StringBuilder

fun main() {
    encodeCaesarCipher("abc", 1) // bcd
    encodeCaesarCipher("abc", 3) // def
    encodeCaesarCipher("xyz", 1) // yza

}

fun encodeCaesarCipher(string: String, number: Int): String {

    val list = letters()
    val builder = StringBuilder()

    string.forEach {
        val indexLetter = if (list.indexOf(it) == list.size - 1) {
            val first = list.indexOf(list.first())

            if (number == 1) {
                first
            } else {
                first + number
            }
        } else {
            list.indexOf(it) + number
        }

        builder.append(list[indexLetter])
    }

    return builder.toString()
}

private fun letters(): MutableList<Char> {
    val list = mutableListOf<Char>()
    ('a'..'z').forEach { list.add(it) }
    return list
}