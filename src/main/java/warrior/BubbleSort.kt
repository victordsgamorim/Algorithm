package warrior

fun main() {

    /*
    * Starting from the beginning of the list, compare every adjacent pair, swap their position if they
    * are not in the right order (the latter one is smaller than the former one). After each iteration,
    * one less element (the last one)
    * is needed to be compared until there are no more elements left to be compared.*/

  sort(listOf(5, 1, 4, 2, 8))

}

fun sort(list: List<Int>): List<Int> {

    val l = list.toMutableList()

    for (i in l.indices) {
        for (j in i + 1 until l.size) {

            if (l[i] > l[j]) {
                val temp = l[i]
                l[i] = l[j]
                l[j] = temp
            }

        }
    }


    return l
}