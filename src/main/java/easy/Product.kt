package easy

fun main() {
    /*Given a list of integers implement a function which returns the product of all numbers in the list.*/

    println(product(listOf(1, 2)))// 2

    println(product(listOf(1, 2, 4))) // 8

    println(product(listOf(2, 4, 10))) // 80
}

fun product(list: List<Int>): Int {

    var index = 1
    var result = 0

    while (index < list.size) {

        if (result == 0) {
            result = list[index] * list[index - 1]
        } else {
            result *= list[index]
        }
        index++
    }

    return result
}
