//.import java.awt.event.MouseAdapter

fun main (){
    val t = Thread(object : Runnable {
        override fun run() {
            println("hello")
        }
    })
    t.run()
}

//  Object Expressions and Declarations

//  Object 용도
//    어떤 class에서 조금 변경된 객체를 생성 할 때
//    새로운 subclass의 명시적인 선언 없이 객체 생성

//  Object Expressions
//    JAVA 익명 객체

//  Object Declarations
//    싱글턴

//  Companion Object
//    싱글턴 + Class method (static)

//  객체 표현식 상속
//    슈퍼타입의 생성자가 있는 경우, 반드시 값을 전달 해 주어야함
//    슈퍼타입이 여러 개인 경우 ':' 콜론 뒤에 ',' 콤마로 구분해서 명시 해주면 됨

//    open class A(x: Int) {
//        public open val y: Int = x
//    }
//
//    interface B { ... }
//
//    val ab: A = object : A(1), B {
//        override val y = 15
//    }

//  객체 표현식 상속 없는 경우
//    특별히 상속 받을 supertypes 가 없는 경우, 간단하게 작성가능

//    val adHoc = object {
//        var x: Int = 0
//        var y: Int = 0
//    }
//
//    print(adHoc.x + adHoc.y)

//fun main(){
//    val data = object {
//        var x = 111
//        var y = 222
//    }
//
//    println("${data.x}, ${data.y}")
//}

//  객체 표현식 제약 사항
//    익명 객체가 local 이나 private 으로 선언될 때만 type으로 사용될 수 있음
//    익명 객체가 public function 이나 public property에서 리턴 되는 경우,
//    익명객체의 슈퍼타입으로 동작됨, 이런 경우 익명 객체에 추가된 멤버에 접근이 불가능함

//class MyClass {
//    public fun publicFun() = object {
//        var x = 111
//    }
//
//    private fun privateFun() = object {
//        var x = 111
//    }
//    fun print() {
//        println(publicFun())
//        println(privateFun().x)
//    }
//}
//
//fun main() {
//    MyClass().print()
//}

//  객체 표현식 특징
//    익명 객체의 코드는 enclosing scope의 변수를 접근 할 수 있음
//    Java와는 다르게 final variables 제약 조건이 없음

//  객체 선언 용도
//    매우 유용한 Singleton 패터을
//    kotlin에서는 object declarations을 이용해서 만들 수 있음

//  객체 선언 문법
//    object 키워드 뒤에 항상 이름이 있어야함
//    object declaration은 object expression이 아님
//    그래서 할당 구문의 우측에 사용 될 수 가없음

//    object DataProviderManager {
//        fun registerDataProvider (provider: DataProvider){}
//        val allDataProviders: Collection<DataProvier>
//    }

//    object declaration의 객체를 참조 하려면, 해당 이름으로 직접 접근하면 됨

//    DataProviderManager.registerDataProvider{...}

//  객체 선언 문법
//    슈퍼타입을 가질 수 있음 (상속가능)

//object CountManager {
//    var count = 0
//}
//
//fun main() {
//    println(CountManager)
//
//    CountManager.count++
//    println(CountManager.count)
//    CountManager.count++
//    println(CountManager.count)
//    CountManager.count++
//    println(CountManager.count)
//}

//  동반자 객체
//    클래스 내부의 object declaration은 companion 키워드를 붙일 수 있음

//    class MyClass {
//        companion object Factory {
//            fun create() : MyClass = MyClass()
//        }
//    }

//    companion object의 멤버는 클래스 이름을 통해서 호출 할 수 있음

//    val instance = MyClass.create()