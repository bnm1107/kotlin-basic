fun main(){
    print(foo5())
}

fun foo0(){
    var ints = listOf(0,1,2,3)
    ints.forEach(
        fun(value: Int) {
            if  (value == 1) return
            print(value)
        }
    )
    print("End")
}

fun foo2() {
    var ints = listOf(0,1,2,3)
    ints.forEach{
        if( it == 1) return
        print(it)
    }
    print("End")
}

fun foo3() {
    var ints = listOf(0,1,2,3)
    ints.forEach label@{
        if(it == 1) return@label
        print(it)
    }
    print("End")
}

fun foo4() {
    var ints = listOf(0,1,2,3)
    ints.forEach {
        if(it === 1) return@forEach
        print(it)
    }
    print("End")
}

fun foo5(): List<String> {
    var ints = listOf(0,1,2,3)
    val result = ints.map{
        if(it === 0){
            return@map "zero"
        }
        "number $it"
    }
    return result
}
