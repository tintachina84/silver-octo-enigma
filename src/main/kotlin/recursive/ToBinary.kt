package recursive

fun main() {
    println(toBinary(10))   // 1010
    println(toBinary(27))   // 11011
    println(toBinary(255))  // 11111111
}

fun toBinary(n: Int): String = when {
    n < 2 -> n.toString()
    else -> toBinary(n / 2) + (n % 2).toString()
}