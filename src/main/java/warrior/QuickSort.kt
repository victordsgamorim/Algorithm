package warrior

fun main() {

    val list = mutableListOf<Int>(6, 4, 2, 7, 3, 1, 5, 8)
    println(quickSort(list))
}

fun quickSort(list: MutableList<Int>): List<Number> {
    if (list.isEmpty()) {
        return list
    }

    val pivot = list[list.size - 1]
    var smaller = 0

    for (i in list.indices) {

        if (list[i] < pivot) {
            swap(list, smaller, i)
            smaller++
        }
    }
    swap(list, smaller, list.size - 1)

    val left = list.subList(0, smaller)
    val right = list.subList(smaller + 1, list.size)


    return quickSort(left) + listOf(pivot) + quickSort(right)
}

fun swap(list: MutableList<Int>, from: Int, to: Int) {
    val temp = list[from]
    list[from] = list[to]
    list[to] = temp
}

