package apprentice

fun main() {

    hasRepeatedCharacter("abc") // false"
    hasRepeatedCharacter("aabc") // true
    hasRepeatedCharacter("aabcc") // true

}

fun hasRepeatedCharacter(string: String) = string
    .groupingBy { it }
    .eachCount()
    .filter { (key, value) -> value > 1 }
    .count() > 0

