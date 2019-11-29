package easy

import java.lang.StringBuilder

fun main() {

    /*
    * Given a string representing constant name (upper case words separated by underscore eg FOO_BAR) implement a
    * function which converts it into variable name (eg. fooBar):

    convert first word to lowercase
    convert next words to lowercase, but first character is still uppercase
    remove all underscore characters*/


    println(decapitalizeConst("FOO")) // foo
    println(decapitalizeConst("FOO_BAR")) // fooBar
    println(decapitalizeConst("__FOO_BAR_BAZ")) // fooBarBaz

}

fun decapitalizeConst(message: String): String {

    val builder = StringBuilder()
    val lower = message.toLowerCase()

    val split = lower
        .split("_", " ")
        .filter { it.isNotEmpty() }

    builder.append(split[0])

    if (split.size > 1) {
        for (i in 1 until split.size) {
            builder.append(split[i].capitalize())
        }
    }

    return builder.toString()
}
