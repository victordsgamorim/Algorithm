package easy

fun main() {

    /*Given positive integer n implement a function which returns a list representing all numbers from n to 1.
    If n value is zero then empty list should be returned.*/

    printNumber(0) // []

    printNumber(2) // [2, 1]

    printNumber(5) // [5, 4, 3, 2, 1]

}

fun printNumber(number: Int): List<Int> {
    val list = mutableListOf<Int>()

    if (number == 0) return list

    for (i in number downTo 1) {
        list.add(i)
    }

    return list

}