package warrior

fun main() {

    /*Sort list of numbers from lowest number to greatest number using insertion sort.*/

    val list = mutableListOf(11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27)

    println(insertionSort())


}

private fun insertionSort(list: List<Int>): List<Int> {
    val list = list.toMutableList()

    for ((range, i) in (1 until list.size).withIndex()) {
        for (j in 0..range) {
            if (list[i] < list[j]) {
                val temp = list[j]
                list[j] = list[i]
                list[i] = temp
            }
        }
    }

    return list
}

//solution 2
private fun insertionSort(): List<Int> {

    val list = mutableListOf(11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27)

    for (i in 1 until list.size) {
        var analyzer = i
        while (analyzer > 0 && list[analyzer] < list[analyzer - 1]) {
            list.swap(analyzer - 1, analyzer)
            analyzer--
        }
    }

    return list
}



