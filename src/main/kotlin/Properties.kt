const val MY_CONST = "CONST"

@Deprecated(MY_CONST)
fun main() {

    var obj = Address()
    //println(obj.name)
    //println(obj.isEmpty)

}

class Address {
    lateinit var data: String

    fun setUp(){
        data = "나중에"
    }
}

/*class Address {
    val isEmpty: Boolean //= false
        get() { return false }
}*/

/*class Address {
    var name: String = "Kotiln"
        get() { return field + "!!" }
        set(value) { field = value}
}*/

//  프로퍼티 선언
//  코틀린 클래스는 프로퍼티를 가질 수 있음
//  var (mutable) / val (read-only)

//    class Address {
//        var name: String = "Kotlin"
//        val city: String = "Seoul"
//    }

//  프로퍼티 사용은 자바의 필드를 사용하듯이 하면 됨

//    fun copyAddress(address: Address): Address {
//        val result = Address()
//        result.name = address.name
//        // ...
//        return result
//    }

