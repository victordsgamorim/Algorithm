package warrior

fun main() {

    /*
    * Given list containing items (integer, lists, sub-lists) implement recursive function which returns list with
    *  all values flattened. This function mimics behaviour of Kotlin build in flatten method.*/

    println(flatten(listOf(1))) // 1
    println(flatten(listOf(1), listOf(listOf(2)))) // 1, 2
    println(flatten(listOf(1), listOf(listOf(2), listOf(listOf(3))))) // 1, 2, 3

}

private fun flatten(vararg list: List<Any>): List<Any> {

    val flattened = mutableListOf<Any>()
    for (i in list.indices) {
        list[i].forEach {
            if (it is List<*>) {
                it.forEach { item ->

                    if (item is List<*>) {
                        item.forEach { j -> j?.let { flattened.add(j) } }
                    }else{
                        item?.let { k -> flattened.add(k) }
                    }
                }
            } else {
                flattened.add(it)
            }

        }
    }
    return flattened
}

