package easy

fun main() {

    /*Given list of strings and a string return index of th value in the list or -1 if value was not found.*/

    val list = listOf<String>("A", "B", "C")
    val result = getIndex(list, "D")
}

fun getIndex(list: List<String>, letter: String): Int {
    return if (letter in list) list.indexOf(letter) else -1
}
