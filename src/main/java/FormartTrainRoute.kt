import java.lang.StringBuilder

fun main() {


    /**
     * Given list of strings representing train station names implement a function which
     * will return passenger friendly String:

    String always starts with Train is calling at
    If list contains single tran station name then return Train is calling at stationName
    If list contains multiple train station names then return comma separated station names,
    but pre-last and last names are separated by and*/

    println(formatTrainRoute("Luton"))
    println(formatTrainRoute("Luton", "Harpenden"))
    println(formatTrainRoute("Luton", "Harpenden", "London"))
}

fun formatTrainRoute(vararg route: String): String {

    val builder = StringBuilder().append("Train is calling at ")
    for (i in route) {
        if (route.indexOf(i) == 0) {
            builder.append("$i")
        } else if (route.size > 2) {

            if (route.indexOf(i) == route.size - 1) {
                builder.append(" and $i")
            } else {
                builder.append(", $i")
            }

        } else if (route.size == 2) {
            builder.append(" and $i")
        }
    }

    return builder.toString()
}