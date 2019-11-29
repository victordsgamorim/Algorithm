package easy

fun main() {

    /*Given a sorted list of integers implement a function which counts the unique values.
    * */

    countUniqueValues(listOf()) // 0

    countUniqueValues(listOf(1, 1, 6)) // 2

    countUniqueValues(listOf(-2, -1, -1, 0, 1)) // 4

}

fun countUniqueValues(list: Collection<Int>) = list.sorted().toSet().size
