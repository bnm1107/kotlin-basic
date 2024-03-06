fun main() {

    doWhen(1)
    doWhen("DiMo")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")

}

fun doWhen(a: Any){
    var result = when(a){
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

    println(result)
}