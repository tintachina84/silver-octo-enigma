fun main(args: Array<String>) {
    val value = sum(5, 10, { x, y -> x + y })
    println(value)
}

fun sum(x: Int, y: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(x, y)
}
