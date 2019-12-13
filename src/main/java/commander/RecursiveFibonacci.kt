package commander

fun main() {

    recusiveFibonacci(mutableListOf<Int>(0, 1), 0, 10)
}

private fun recusiveFibonacci(list: MutableList<Int>, from: Int, to: Int): List<Int> {
    var i = from

    if (i == to) {
        return list
    }

    list.add(list[list.lastIndex - 1] + list[list.lastIndex])

    i++
    return recusiveFibonacci(list, i, to)

}

