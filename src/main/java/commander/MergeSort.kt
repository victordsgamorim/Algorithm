package commander

fun main() {

    /*
    * Sort list of numbers from lowest number to greatest number using merge sort.

Algorithm:

Find middle point
Split unsorted list into two lists (using middle point)
Split lists until each list has single element (a list containing one element is considered sorted)
Merge sub-lists to produce new sorted sub-lists until there is only one sub-list remaining.
* This will be the sorted list.
    * */

    val list = mutableListOf<Int>(3, 6, 4, 1, 2, 5)
    mergeSort(list, 0, list.size)

    println(list)
}

fun mergeSort(list: MutableList<Int>, start: Int, end: Int) {

    val elements = end - start
    val mid = (start + end) / 2

    if (elements > 1) {

        mergeSort(list, start, mid)
        mergeSort(list, mid, end)
        merge(list, start, mid, end)

    }
}

fun merge(list: MutableList<Int>, start: Int, mid: Int, end: Int) {

    val tempList = mutableListOf<Int>()

    var index1 = start
    var index2 = mid

    while (index1 < mid && index2 < end) {
        if (list[index1] < list[index2]) {
            tempList.add(list[index1])
            index1++
        } else {
            tempList.add(list[index2])
            index2++
        }
    }

    while (index1 < mid) {
        tempList.add(list[index1])
        index1++
    }

    while (index2 < end) {
        tempList.add(list[index2])
        index2++
    }

    for (i in tempList.indices) {
        list[start + i] = tempList[i]
    }
}
