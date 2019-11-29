package easy

fun main() {

    /*Given a list of integers return a list that contains only odd integers
    (only integers which are not a multiple of 2).*/

    val numbers = listOf<Int>(2, 3, 4, 5, 6, 8, 7)
    println(numbers.oddNumbers())

}

fun List<Int>.oddNumbers(): List<Int> {
    return this.filter { it % 2 != 0 }
}