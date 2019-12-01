package apprentice

fun main() {

    /*Given a positive integer n implement a function which returns a list representing the generated
    steps with n levels using the # character. Make sure the step has appropriate
    number of spaces on the right hand side!*/

    steps(2)
    "# "
    "##"

    steps(3)
    "#  "
    "## "
    "###"

    steps(4)
    "#   "
    "##  "
    "### "
    "####"


}

fun steps(number: Int): String {
    val builder = StringBuilder()

    for (i in 1..number) {
        repeat(i) {
            builder.append("#")
        }

        builder.append("\n")
    }
    return builder.toString()
}

