package warrior

import java.lang.IllegalArgumentException
import java.lang.NullPointerException

fun main() {
    val queue = Queue<Int>()
    queue.add(1)
    queue.add(2)
    queue.add(3)
    queue.remove()

    println(queue.lista)
    println(queue.peek())

    queue.remove()
    println(queue.peek())
    println(queue.lista)

    queue.remove()
    println(queue.peek())
    println(queue.lista)

    queue.remove()

}

interface Data<T> {
    fun add(element: T)
    fun remove(): Boolean?
    fun peek(): T?
    fun isEmpty(): Boolean
}

class Queue<T>(private val queue: MutableList<T> = mutableListOf()) : Data<T> {

    private var value: T? = null
    val lista = this.queue

    override fun add(element: T) {
        queue.add(element)
    }

    override fun remove() = if (!isEmpty()) queue.remove(queue.first()) else null

    override fun peek(): T? = queue.firstOrNull()

    override fun isEmpty() = queue.size == 0


}