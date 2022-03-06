import kotlin.jvm.internal.Intrinsics.Kotlin

fun main(args: Array<String>) {
    val kotlin: ClassExtension = ClassExtension()
    kotlin.printBar()
    kotlin.printFoo()
    kotlin.printKotlin()
}

interface Foo {
    fun printFoo() {
        println("Foo")
    }

    fun printKotlin() {
        println("Foo Kotlin")
    }
}

interface Bar {
    fun printBar() {
        println("Bar")
    }

    fun printKotlin() {
        println("Bar Kotlin")
    }
}

class ClassExtension : Foo, Bar {
    override fun printKotlin() {
        super<Foo>.printKotlin()
        super<Bar>.printKotlin()
    }

}