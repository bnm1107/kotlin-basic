fun main() {
    val obj = NoData("Kotiln",113)
    println(obj);

    val obj2 = User("Kotlin",113)
    println(obj2);

    val obj3 = obj2.copy(age = 777)
    println(obj3)


    // Destructuring Declarations
    val(name, age) = User("1",1)

    println("name =$name")
    println("age =$age")

    // Standard Data Classes
    val obj4 = Pair<String,Int>("2",2)

    println(obj4)
}
class NoData(var name: String, var age: Int)

// data 클래스는 toString() 자동으로 생성
data class User(var name: String, var age: Int){
    var other: Int = 1
}
//data class User(var name: String = "", var age: Int = 0)


//  Data 클래스
//  용도 : 데이터는 보유하지만 아무것도 하지 않는 클래스
//  코틀린에서는 data class 제공

//  data class User(val name: String, val age: Int)

//    기본 생성자에서 선언된 속성을 통해, 아래의 기능들을 컴파일러가 자동으로 생성해 줌
//    equals()
//    hashCode()
//    copy()
//    toString() of the form "User(name=John, age=42)",
//    componentN() functions
//    명시적으로 정의해주는 경우에는, 컴파일러가 자동으로 생성해 주지 않음

//  의미 있는 Data 클래스의 조건
//    기본생성자에 1개 이상의 파라미터
//    기본생성자의 파라미터가 var, val로 선언
//    Data 클래스는 abstract, open, sealed, inner가 안됨

//  1.1이후에 바뀐 점
//    Data 클래스 interface 구현 가능
//    Sealed class 상속가능

//  기본값
//    JVM 에서 파라미터 없는 생성자가 필요한 경우,
//    모든 프로퍼티에 기본 값을 설정해 주면 됨

//  Data class User(val name: String = "", val age: Int = 0)

//  val exam_0 = User()
//  val exam_1 = User("Kotiln")
//  val exam_2 = User("Kotiln", 113)
//  val exam_3 = User(age=113)
//  val exam_4 = User(name="Kotlin",age=113)

//  복사
//    객체의 기존 값들은 유지하고, 일부 값만 고쳐서 새로운 객체를 만들고 싶은 경우
//    Data 클래스에 컴파일러가 copy를 만들어 주기 때문에 바로 copy를 호출해서 사용하면 됨

//  fun copy(name: String = this.name, age: Int = this.age) = User(name, age)

//  val jack = User(name = "jack", age = 1)
//  val olderJack = jack.copy(age=2)

//  Destructuring Declarations
//    data 클래스는 Destructuring Declarations을 사용 가능함
//    컴파일러가 componentN 함수를 자동으로 만들어 주기 때문

//  val jane = User("jane", 35)
//  val (name, age) = jane
//  println("$name, $age years of age")

//  Standard Data Classes
//    스탠다드 라이브러리에서 제공하는 data 클래스도 있음
//      pair
//      Triple
//    물론 가독성을 위해서는 프로퍼티에 의미 있는 이름을 제공하는 클래스가 최고임

//  val jane = User("Jane", 35)
//  println(jane)

// val pair = Pair("Jane", 35)
//  println(pair)


//  중첩 클래스 (Nested Classes)
//    클래스는 다른 클래스에 중첩될 수 있음


//  내부 클래스 (Inner Class)
//    클래스에 inner를 표기하면 바깥쪽 클래스의 멤버에 접근 할 수 있음


//  익명 내부 클래스 (Anonymous inner classes)
//    객체 표현시 (object expression)을 이용해서 익명 내부 클래스의 인스턴스를 생성할 수 있음
//    Functional java interface 인 경우에는 접두어에 인터페이스 이름을 사용해서 람다식으로 표현할 수 도 있음



