package recursive

fun main() {
    helloFunc(10)
    println(func(5))
    println(power(2.0, 10))
    println(factorial(5))
}

private fun helloFunc(n: Int) {
    when {
        n < 0 -> return
        else -> {
            println("Hello")
            helloFunc(n - 1)
        }
    }
}

private fun func(n: Int): Int = when {
    n < 0 -> 0
    else -> n + func(n - 1)
}

private fun power(x: Double, n: Int): Double = when (n) {
    0 -> 1.0
    else -> x * power(x, n - 1)
}

private fun factorial(n: Int): Int = when (n) {
    0 -> 1
    else -> n * factorial(n - 1)
}

