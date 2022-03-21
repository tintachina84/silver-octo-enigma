package recursive

fun main() {
    println(replicate(3, 5))    // [5, 5, 5]
    println(replicate(5, 1))    // [1, 1, 1, 1, 1]
}

fun replicate(n: Int, element: Int): List<Int> = when {
    n <= 0 -> listOf()
    else -> listOf(element) + replicate(n - 1, element)
}