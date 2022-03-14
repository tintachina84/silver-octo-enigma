fun main(args: Array<String>) {
    letTest()

    val user: User2? = User2("Joe", "Cho")
    val name = user?.let { it.lastName + it.firstName } ?: "lazysould"
    printUserName(user)
    println(name)

    withTest()
    runTest1()
    runTest2()
    applyTest()
    alsoTest()
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

fun runTest1() {
    val person = Person("FP", 30)
    val result = person.run {
        name = "Kotlin"
        age = 10
        this
    }

    println(result)
}

fun runTest2() {
    val person = run {
        val name = "Kotlin"
        val age = 10
        Person(name, age)
    }

    println(person)
}

fun applyTest() {
    val person = Person("FP", 30)
    val result = person.apply {
        name = "Kotlin"
        age = 10
    }

    println(result)
}

fun alsoTest() {
    val person = Person("FP", 30)
    val result = person.also {
        it.name = "Kotlin"
        it.age = 10
    }

    println(result)
}