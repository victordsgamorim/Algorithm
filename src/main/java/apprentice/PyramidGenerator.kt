package apprentice

import java.lang.StringBuilder

fun main() {

    /*
    * Given a positive integer n implement a function which returns a list representing the
    * generatePyramid shape with n levels. The function should console log a generatePyramid
    * shape with N levels using the # character.
    * Make sure the generatePyramid has spaces on both the left and right hand sides.*/

    pyramid(1)
    '#'

    pyramid(2)
    " # "
    "###"

    pyramid(3)
    "  #  "
    " ### "
    "#####"


}

fun pyramid(rows: Int) {
    val builder = StringBuilder()

    var columns = getColumns(rows)
    var space = columns / 2

    var hastag = 0
    var rest = 0

    for (i in 1..rows) {

        hastag = (i * i) - rest
        if (rest == 0) rest = hastag else rest += hastag

        repeat(space) {
            builder.append(" ")
        }

        repeat(hastag) {
            builder.append("#")
        }

        repeat(space) {
            builder.append(" ")
        }

        builder.append("\n")

        space--
    }

    println(builder.toString())

}

private fun getColumns(rows: Int): Int {
    var col = 0
    var rest = 0

    for (i in 1..rows) {
        col = (i * i) - rest
        if (rest == 0) rest = col else rest += col
    }
    return col
}
