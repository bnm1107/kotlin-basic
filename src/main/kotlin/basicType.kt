fun main(){
    var a: Int = 10000
    var b: Int? = 10000

    println("a === b: ${ a === b }")
    println("a == b: ${ a == b }")

    val bArray = Array(5, {i -> i.toString() })

    val aArray = arrayOf("0","1","2","3","4")

    for ( c in aArray) {
        print(c)
    }
    println()

    for ( c in bArray){
        print(c)
    }
    println()

    val s = """
        이것은 코틀린의
        raw String 입니다.
    """.trimIndent()

    println(s)

}

//error
/*fun check(c: Char){
    if (c == 1)
}*/

