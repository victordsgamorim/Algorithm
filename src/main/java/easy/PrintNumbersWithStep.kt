package easy

fun main() {

    /*Given positive integer n and integer step implement a function which returns a list
    representing all numbers from n to 1 taking step into consideration. If n value is zero
    then empty list should be returned.*/

    printNumber(0, 1) // []

    printNumber(6, 1) // [6, 5, 4, 3, 2, 1]

    printNumber(6, 2) // [6, 4, 2]

}

fun printNumber(number: Int, step: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in number downTo 1 step step) {
        list.add(i)
    }

    return list
}