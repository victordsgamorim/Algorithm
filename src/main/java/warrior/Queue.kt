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
    fun remove()
    fun peek(): T
    fun isEmpty(): Boolean
}

class Queue<T>(private val queue: MutableList<T> = mutableListOf()) : Data<T> {

    private var value: T? = null
    val lista = this.queue

    override fun add(element: T) {
        queue.add(element)
    }

    override fun remove() {

        if (!isEmpty()) {
            val fifo = queue.first()
            value = fifo
            queue.remove(fifo)
        } else {
            throw NullPointerException("Queue is empty so it cannot delete null space")
        }
    }

    override fun peek(): T {
        return value ?: throw IllegalArgumentException("No such element in the queue has been removed yet.")
    }

    override fun isEmpty() = queue.size == 0


}