package easy

fun main() {

    /*Given positive integer n implement a function which returns a list containing all steps from n to 0.*/
    val number = 21
    val countdown = countdown(number)

}

fun countdown(number: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in number downTo 0) {
        list.add(i)
    }
    return list
}