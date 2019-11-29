package easy

fun main() {

    power(2, 1) // 1
    power(2, 2) // 4
    power(3, 3) // 27
    power(4, 4) // 256


}

fun power(power: Int, number: Int): Int {
    var result = 0

    for (i in 1 until power) {
        if (result == 0) result = number.times(number) else result *= number
    }

    return result
}