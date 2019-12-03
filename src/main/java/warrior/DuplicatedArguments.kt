package warrior

fun main() {

    /*Given variable number of arguments (list of strings) checks whether there are any duplicates among the
    arguments and return list of all unique duplicates. If no arguments are passes return empty list.*/

    getDuplicatedParams("a", "b", "c") //empty list

    getDuplicatedParams("a", "b", "c", "a") // [a]

}

fun getDuplicatedParams(vararg s: String)  =
    s.map { it }
        .groupingBy { it }
        .eachCount()
        .filter { (key, value) -> value > 1 }
        .keys
        .toList()


