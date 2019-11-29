package easy

fun main() {

    /*Given positive Int n implement a function which returns a
    list of containing pairs with all combinations of numbers from 0 to n.*/

    getAllPairs(1) // [Pair(0, 0), Pair(0, 1), Pair(1, 0), Pair(1, 1)]
    getAllPairs(2) // [Pair(0, 0), Pair(0, 1), Pair(0, 2), Pair(1, 0), Pair(1, 1), Pair(1, 2), Pair(2, 0), Pair(2, 1), Pair(2, 2)]
}

fun getAllPairs(number: Int): List<Pair<Int, Int>> {
    val list = mutableListOf<Pair<Int, Int>>()

    for (i in 0..number) {
        for (j in 0..number) {
            list.add(Pair(i, j))
        }
    }
    return list
}

