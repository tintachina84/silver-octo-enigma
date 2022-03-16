interface Box<T>

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
}

fun invariant(value: Box<JVM>) {}