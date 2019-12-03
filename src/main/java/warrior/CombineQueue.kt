package warrior

fun main() {

    /*Given two queues implement a function which combines the contents of each queue into third queue.
    The third queue should contain the content of the two queues. The function should handle queues of different
    lengths without inserting null into the new one. Take into consideration the fact that both queues may be of
    different length.
    IntQueue can only expose add, remove, and peek methods to external clients.*/

    val queueOne = Queue<Int>()
    queueOne.add(1)
    queueOne.add(2)

    val queueTwo = Queue<String>()
    queueTwo.add("Hi")
    queueTwo.add("There")

    val queueThree = combine(queueOne, queueTwo)
    queueThree.remove() // 1
    queueThree.remove() // 'Hi'
    queueThree.remove() // 2
    queueThree.remove() // 'There'

}

fun combine(q1: Queue<*>, q2: Queue<*>): Queue<*> {

    val queue = Queue<Any>()

    while (true) {
        q1.remove()?.let { queue.add(it) }
        q2.remove()?.let { queue.add(it) }

        if (q1.peek() == null && q2.peek() == null) {
            break
        }
    }

    return queue

}


