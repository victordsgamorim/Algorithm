package commander

//val masterList = mutableListOf<List<Int>>()

fun main() {

    /*Given an list and chunk size, divide the list into multiple sub lists where each sub-list
    is of length of chunk size.*/

    println(chunk(listOf(1, 2, 3, 4), 2)) // [[ 1, 2], [3, 4]]
    println(chunk(listOf(1, 2, 3, 4, 5), 2)) // [[ 1, 2], [3, 4], [5]]
    println(chunk(listOf(1, 2, 3, 4, 5, 6, 7, 8), 3)) // [[ 1, 2, 3], [4, 5, 6], [7, 8]]
    println(chunk(listOf(1, 2, 3, 4, 5), 4)) // [[ 1, 2, 3, 4], [5]]
    println(chunk(listOf(1, 2, 3, 4, 5), 10)) // [[ 1, 2, 3, 4, 5]]


}

fun chunk(list: List<Int>, number: Int): List<List<Int>> {

    val tempList = mutableListOf<List<Int>>()

    if (number > list.size) {
        addSubList(list, 0, list.size, tempList)
        return tempList
    }

    for (i in list.indices step number) {

        val end = i + number

        if (i == 0) {
            addSubList(list, i, number, tempList)
        } else if (i != 0 && end < list.size) {
            addSubList(list, i, end, tempList)
        } else {
            addSubList(list, i, list.size, tempList)
        }

    }


    return tempList
}

private fun addSubList(
    actual: List<Int>,
    from: Int,
    to: Int,
    newList: MutableList<List<Int>>
) {
    val subList = actual.subList(from, to)
    newList.add(subList)
}

/**doing it as a recursive function!*/
//fun chunk(list: List<Int>, start: Int, number: Int): List<List<Int>> {
//
//    val end = start + number
//
//    if (end >= list.size) {
//        addSubList(list, start, list.size)
//        return masterList
//    }
//
//    if (start == 0) addSubList(list, start, end) else addSubList(list, start, end)
//    return chunk(list, end, number)
//}
//
//private fun addSubList(list: List<Int>, start: Int, end: Int) {
//    val subList = list.subList(start, end)
//    masterList.add(subList)
//}



