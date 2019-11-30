package apprentice

fun main() {
    /*Given a string implement a function which returns a reversed copy of that string.*/

    reverse("apple")
    reverse("hello")
    reverse("Greetings!")

}

fun reverse(string: String): String {
    val list = mutableListOf<Char>()
    string.forEach { list.add(it) }

    var start = 0
    var end = list.size - 1

    while (start < end) {
        val temp = list[start]
        list[start] = list[end]
        list[end] = temp
        start++
        end--
    }

    val builder = StringBuilder()

    for (i in list) {
        builder.append(i)
    }

    return builder.toString()
}
