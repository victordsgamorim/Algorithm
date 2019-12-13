package commander

fun main() {

    /*
    * Given list of integers and integer n implement a function which calculates the maximum sum of n
    * consecutive elements in the list (sum of n digits next to another that have the largest sum).
    * */


    println(maxSubListSum(listOf<Int>(), 3)) // null

    maxSubListSum(listOf(4, 2, 7), 2) // 9

    maxSubListSum(listOf(4, 2, 7, 5, 8, 9, 5, 1), 3) // 22
}

private fun maxSubListSum(list: List<Int>, n: Int): Int? {
    if (list.size < n) {
        return null
    }

    return list.foldIndexed(0 to 0) { i, (sum, max), next ->
        (sum + next - (list.getOrNull(i - n) ?: 0)).let {
            it to if (it > max) it else max
        }
    }.second
}