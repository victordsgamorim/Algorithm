package warrior


fun main() {

    /*Given list of sorted elements and a element return index of that element in the list or -1 if
    element was not found. Use binary search algorithm.
    * */

    println(binarySearch(listOf('A', 'B', 'C'), 'A')) // 0

    println(binarySearch(listOf('A', 'B', 'C'), 'B')) // 1

    println(binarySearch(listOf('A', 'B', 'C'), 'H')) // -1

    val lista = mutableListOf<Char>('E', 'F', 'G', 'A', 'B', 'D', 'C')
    lista.sort()
    println(binarySearch(lista, 0, lista.size, 'E')) // 4


}


private fun binarySearch(list: MutableList<Char>, start: Int, end: Int, char: Char): Int {

    val mid = (start + end) / 2
    val midValue = list[mid]

    if (start > end) {
        return -1
    }

    if (midValue == char) {
        return mid
    }

    if (midValue > char) {
        return binarySearch(list, start, mid - 1, char)
    }
    return binarySearch(list, mid + 1, end, char)
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
        } else {
            for (i in middle..last) {
                if (list[i] == letter) {
                    return i
                }
            }
        }
    }

    return -1

}




