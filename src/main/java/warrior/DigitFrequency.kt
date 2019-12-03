package warrior

fun main() {
    /*Given two integers implement a function which determines if they have the same frequency of digits.*/

    equalDigitFrequency("123", "321") // true

    equalDigitFrequency("4557", "745") // false

}

fun equalDigitFrequency(input1: String, input2: String) =
    input1.map { it }
        .groupingBy { it }
        .eachCount() == input2.map { it }.groupingBy { it }.eachCount()
