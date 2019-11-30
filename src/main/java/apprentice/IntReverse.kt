package apprentice

import kotlin.math.sign

fun main() {
    /*Given an integer n, return an integer that is the reverse ordering of digits.*/

    reverseInt(15) // 51
    reverseInt(981) // 189
    reverseInt(500) // 5
    reverseInt(-15) // -51
    reverseInt(-90) // -9

}

fun reverseInt(i: Int): Int{
    val list = mutableListOf<Char>()
    i.toString().forEach { list.add(it) }

    var start = 0
    var end = list.size - 1

    while (start < end) {
        if (list[0] == '-') start++

        val temp = list[start]
        list[start] = list[end]
        list[end] = temp

        start++
        end--
    }

    val builder = StringBuilder()
    for(i in list){
        builder.append(i)
    }

    return  builder.toString().toInt()
}
