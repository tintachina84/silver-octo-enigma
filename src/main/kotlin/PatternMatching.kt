fun main(args: Array<String>) {
    println(checkValue("kotlin"))
    println(checkValue(5))
    println(checkValue(15))
    println(checkValue(User("Joe", 76)))
    println(checkValue("Unknown"))
}

data class User(val name: String, val age: Int)

fun checkValue(value: Any) = when (value) {
    "kotlin" -> "kotlin"
    in 1..10 -> "1..10"
    11, 15 -> "11 or 15"
    is User -> "User"
    else -> "SomeValue"
}
