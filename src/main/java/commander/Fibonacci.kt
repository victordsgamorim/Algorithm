package commander

fun main() {

    fibonacci(1) // 1
    fibonacci(2) // 1
    fibonacci(3) // 2
    fibonacci(4) // 3


}

fun fibonacci(number: Int) = generateSequence(0 to 1)
{ (first, second) -> Pair(second, first + second) }
    .map { it.first }
    .take(number + 1)
    .toList()[number]

