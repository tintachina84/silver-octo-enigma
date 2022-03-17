interface Box<T>
interface Box2<T> {
    fun read(): T
    fun write(value: T)
}
//interface Box2<out T> {
//    fun read(): T
//    fun write(value: T)    // compile error
//}
//interface Box2<in T> {
//    fun read(): T         // compile error
//    fun write(value: T)
//}

open class Language
open class JVM : Language()
open class Kotlin2 : JVM()

fun main(args: Array<String>) {
    val languageBox = object : Box<Language> {}
    val jvmBox = object : Box<JVM> {}
    val kotlinBox = object : Box<Kotlin2> {}

//    invariant(languageBox) // 컴파일 오류
    invariant(jvmBox)
//    invariant(kotlinBox) // 컴파일 오류

//    covariant(languageBox) // 컴파일 오류
    covariant(jvmBox)
    covariant(kotlinBox)

//    upperBound(languageBox) // 컴파일 오류
    upperBound(jvmBox)
    upperBound(kotlinBox)

    contravariant(languageBox)
    contravariant(jvmBox)
//    contravariant(kotlinBox) // 컴파일 오류
}

fun invariant(value: Box<JVM>) {}
fun covariant(value: Box<out JVM>) {}
fun <T : JVM> upperBound(value: Box<T>) {}
fun contravariant(value: Box<in JVM>) {}
