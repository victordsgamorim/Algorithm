package warrior

fun main() {

    /*
    * Given integer n implement a function which generates a spiral numbers matrix (size n x n).
    * Numbers in matrix are placed according to spiral - starting top left corner and then
    * go right, down, left, up, right...*/


    val matrix2 = generateSpiralMatrix(2)
    val matrix3 = generateSpiralMatrix(3)
    val matrix4 = generateSpiralMatrix(4)

    for(i in matrix2){
        println(i)
    }

    println()

    for(i in matrix3){
        println(i)
    }

    println()
    for(i in matrix4){
        println(i)
    }

}

private fun generateSpiralMatrix(number: Int): List<List<Int?>> {
    val matrix = createEmptyMatrix(number)

    var leftRight = 0
    var topBottom = matrix.size - 1
    var rightLeft = matrix.size - 1
    var bottomTop = 0

    var complete = false
    var value = 1
    while (!complete) {

        // add values in row from left to right
        value = rowLeftRight(matrix, leftRight, value)

        //add values to column from top to bottom
        value = columnTopBottom(matrix, topBottom, value)

        // add values in reversed row from right to left starting from the last row in the matrix
        /*[1,2]
          [4,3] <--
        * */
        value = rowRightLeft(matrix, rightLeft, value)


        //add values to column from bottom to top start
        for (i in (number - 1) downTo 0) {
            val columnTopBottom = matrix[i]

            if (columnTopBottom[bottomTop] == null) {
                columnTopBottom[bottomTop] = value
                value++
            }
        }
        bottomTop++

        //check if the addition of values has completed
        complete = checkCompleteTest(matrix, complete)

    }
    return matrix
}

private fun rowRightLeft(
    matrix: List<MutableList<Int?>>,
    row: Int,
    value: Int
): Int {
    var r = row
    var v = value

    val rowRightLeft = matrix[r]
    for (i in (matrix.size - 1) downTo 0) {
        if (rowRightLeft[i] == null) {
            rowRightLeft[i] = v
            v++
        }
    }
    r--
    return v
}

private fun columnTopBottom(
    matrix: List<MutableList<Int?>>,
    column: Int,
    value: Int
): Int {
    var c = column
    var v = value
    for (i in matrix.indices) {
        val columnTopBottom = matrix[i]
        if (columnTopBottom[c] == null) {
            columnTopBottom[c] = v
            v++
        }
    }
    c--
    return v
}

private fun rowLeftRight(
    matrix: List<MutableList<Int?>>,
    row: Int,
    value: Int
): Int {
    var r = row
    var v = value
    val rowLeftRight = matrix[r]
    for (i in matrix.indices) {
        if (rowLeftRight[i] == null) {
            rowLeftRight[i] = v
            v++
        }
    }
    r++
    return v
}

private fun checkCompleteTest(
    matrix: List<List<Int?>>,
    complete: Boolean
): Boolean {

    var bool = complete
    var rowsCompleted = 0
    for (i in matrix.indices) {

        val emptySpace = matrix[i].any { it == null }
        if (!emptySpace) {
            rowsCompleted++

            if (rowsCompleted == matrix.size) {
                bool = true
            }
        }
    }
    return bool
}

private fun createEmptyMatrix(number: Int): MutableList<MutableList<Int?>> {
    val matrix = mutableListOf<MutableList<Int?>>()

    repeat(number) {
        val content = mutableListOf<Int?>()
        repeat(number) {
            content.add(null)
        }
        matrix.add(content)
    }

    return matrix
}
