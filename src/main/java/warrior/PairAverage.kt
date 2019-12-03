package warrior

fun main() {

    println(hasAverage(listOf(), 1.0)) // false
    println(hasAverage(listOf(3, 4, 7, 9), 6.5)) // true
    println(hasAverage(listOf(3, 4, 7, 9), 3.0)) // false
    println(hasAverage(listOf(3, 5, 9, 7, 11, 14), 8.0)) // true


}

fun hasAverage(l: List<Int>, d: Double): Boolean {

    for (i in l.indices) {
        for (j in (i + 1) until l.size) {
            var avg = (l[i] + l[j]).toDouble() / 2

            if (avg == d) {
                return true
            }
        }
    }

    return false

}

