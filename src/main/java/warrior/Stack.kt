package warrior

fun main() {
    val s = Stack<Int>()
    s.add(1)
    s.add(2)
    s.remove() // 2
    s.remove() // 1
    s.remove() // null

}

class Stack<T>(private val s: MutableList<T> = mutableListOf()) : Data<T> {

    val stack = this.s.toList()
    val size = s.size

    override fun add(element: T): T {
        this.s.add(element)
        return element
    }

    override fun remove(): T? {

        if (!isEmpty()) {
            val temp = s.last()
            s.remove(s.last())
            return temp
        }

        return null
    }

    override fun peek(): T? = s.lastOrNull()
    override fun isEmpty() = s.size == 0


}