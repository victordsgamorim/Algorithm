fun main() {

    /*Given two ranges implement a function which checks if range1 contains range2.*/

    println(containRange(5..7, 5..7))
    println(containRange(1..12, 5..7))
    println(containRange(5..8, 5..9))
}

fun containRange(range1: IntRange, range2: IntRange): Boolean {
    val check = mutableListOf<Boolean>()
    for (i in range2) check.add(i in range1)
    return check.count { !it } == 0

}