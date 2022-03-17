package recursive

fun List<Int>.head() = first()
fun List<Int>.tail() = drop(1)

fun main() {
    println(maximum(listOf(1, 3, 2, 8, 4)))
}

private fun maximum(items: List<Int>): Int = when {
    items.isEmpty() -> error("empty list")
    1 == items.size -> items[0]
    else -> {
        val head = items.head()
        val tail = items.tail()
        val maxVal = maximum(tail)
        if (head > maxVal) head else maxVal
    }
}
