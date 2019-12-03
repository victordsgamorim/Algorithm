package warrior

fun main() {
    val q = Queue<Int>()
    q.add(1)
    q.add(2)
    q.add(3)
    q.remove()

    println(q.queue)
    println(q.peek())

    q.remove()
    println(q.peek())
    println(q.queue)

    q.remove()
    println(q.peek())
    println(q.queue)

    q.remove()

}

interface Data<T> {
    fun add(element: T): T
    fun remove(): T?
    fun peek(): T?
    fun isEmpty(): Boolean
}

class Queue<T>(private val q: MutableList<T> = mutableListOf()) : Data<T> {

    private var value: T? = null
    val queue = this.q.toList()

    override fun add(element: T): T {
        q.add(element)
        return element
    }

    override fun remove(): T? {
        if (!isEmpty()) {
            val temp = q.first()
            q.remove(q.first())
            return temp
        }
        return null
    }

    override fun peek(): T? = q.firstOrNull()

    override fun isEmpty() = q.size == 0

}