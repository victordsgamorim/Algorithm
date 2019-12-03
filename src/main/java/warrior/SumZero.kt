package warrior

fun main() {
    /*
    * Given sorted list of integers implement a function which finds the first pair where the sum equals to 0.
    * Return an pair that includes both values that sum to zero or null if a pair does not exist.*/

    println(sumZero(listOf(1, 2))) // null

    println(sumZero(listOf(-3, -2, 0, 1, 2))) // Pair(-2, 2)
}

fun sumZero(l: List<Int>): Pair<Int, Int>? {


    for (i in l.indices) {
        for (j in (i + 1) until l.size) {
            val sum = l[i] + l[j]

            if (sum == 0) {
                return Pair(l[i], l[j])
            }
        }
    }

    return null
}
