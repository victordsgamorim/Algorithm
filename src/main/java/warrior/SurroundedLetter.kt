package warrior

fun main() {

    surroundedLetter("+a+") // true
    surroundedLetter("+ab+") // false
    surroundedLetter("+a+b+") // true
    surroundedLetter("+a++b++") // true
}

fun surroundedLetter(s: String): Boolean {
    val letters = 'a'..'z'
    for (i in letters) {
        if (i in s) {
            val indexLetter = s.indexOf(i)

            if (s.length > 2 &&
                s[indexLetter - 1] == '+' &&
                s[indexLetter + 1] == '+'
            ) {
                return true
            }
        }
    }
    return false
}

