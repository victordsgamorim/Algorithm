package warrior

fun main() {

    /*Given list of sorted elements and a element return index of that element in the list or -1 if
    element was not found. Use binary search algorithm.
    * */

    println(binarySearch(listOf('A', 'B', 'C'), 'A')) // 0

    println(binarySearch(listOf('A', 'B', 'C'), 'B')) // 1

    println(binarySearch(listOf('A', 'B', 'C'), 'H')) // -1
}

private fun binarySearch(list: List<Char>, letter: Char): Int {

    val first = 0
    val middle = list.size / 2
    val last = list.size - 1

    if (letter in list) {
        if (letter < list[middle]) {
            for (i in first..middle) {
                if (list[i] == letter) {
                    return i
                }
            }
        }else{
            for (i in middle..last) {
                if (list[i] == letter) {
                    return i
                }
            }
        }
    }

    return -1

}

