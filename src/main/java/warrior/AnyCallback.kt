package warrior

fun main() {
    /*
    * Given list of integers and callback implement a recursive function which returns true if simple value in the
    * list passed to callback returns true, otherwise return false.*/

    val callback3: ((Int) -> Boolean) = { it > 3 }
    println(anyCallback(listOf(1, 2, 3, 4), callback3)) // true

    val callback4: ((Int) -> Boolean) = { it > 3 }
    println(anyCallback(listOf(1, 2, 3), callback4)) // false

}

fun anyCallback(list: List<Int>, callback: (Int) -> Boolean): Boolean {

    for (i in list) {
        if (callback(i)) return true
    }

    return false
}



