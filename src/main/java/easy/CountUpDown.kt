package easy

fun main() {

    /*Given positive integer n implement a function which returns
    a list containing all steps up from 0 to n and down to 0.*/

    val number = 10
    countUpAndDown(number)

}

fun countUpAndDown(number: Int): List<Int> {
    val list = mutableListOf<Int>()

    for (i in 0..number) {
        list.add(i)
    }

    for (i in number - 1 downTo 0) {
        list.add(i)
    }

    return list
}