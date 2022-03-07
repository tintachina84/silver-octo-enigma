fun main(args: Array<String>) {
    letTest()

    val user: User2? = User2("Joe", "Cho")
    val name = user?.let { it.lastName + it.firstName } ?: "lazysould"
    printUserName(user)
    println(name)

    withTest()
}

data class Person(var name: String, var age: Int)
fun letTest() {
    val person = Person("FP", 30)
    val result = person.let {
        it.name = "Kotlin"
        it.age = 10
        it
    }

    println("$result")
}

data class User2(val firstName: String, val lastName: String)
fun printUserName(user: User2?) {
    user?.let { println(it.firstName) }
}

fun withTest() {
    val person = Person("FP", 30)
    val result = with(person) {
        name = "Kotlin"
        age = 10
        this
    }
    
    println(result)
}

fun runTest() {
    // TODO: run
}