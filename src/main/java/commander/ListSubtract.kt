package commander

fun main() {
    getSubtraction(listOf("A", "B", "C"), listOf("A")) // "B", "C"

    getSubtraction(listOf("A", "B", "C"), listOf("A", "B")) // "C"

    getSubtraction(listOf("A", "B", "C", "A"), listOf("A", "B")) // "C", "A"

    getSubtraction(listOf("A", "B", "C"), listOf("A", "B", "C")) // nothing

}

fun getSubtraction(l1: List<String>, l2: List<String>): List<String> {
    val list1 = l1.toMutableList()
    for (i in l2) if (i in list1)  list1.remove(i)
    return list1

}



