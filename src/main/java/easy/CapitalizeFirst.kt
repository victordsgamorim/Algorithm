package easy

fun main() {

    /*Given list of strings implement a recursive function which will capitalize first letter
    of each string in the list.*/

    capitalizeFirst(listOf("igor")) // listOf("Igor")
    capitalizeFirst(listOf("igor", "wojda")) // listOf("Igor", "Wojda")


}

fun capitalizeFirst(list: List<String>): List<String> {
    val newList = list.toMutableList()

    for (i in newList.indices) {
        newList[i] = newList[i].capitalize()
    }

    return newList
}