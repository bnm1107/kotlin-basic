fun main(args: Array<String>) {
    var a = 1
    var b = 2
    val max = if(a>b) a else b

    var x = 90

    var res = when(x) {
        100 -> "A"
        90 -> "B"
        80 -> "C"
        else -> "F"
    }

    println(res)

    /*
    val myData = MyData{}
    myData.iterator()
    for( item in myData){
        print{item}
    }
    */

}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prifix")
    else -> false
}

fun hasPrefix2(x: Any){
    /*when {
        x.isOdd() -> print("x is odd")
        x.isEven() -> print("x is even")
        else -> print("x is funny")
    }*/
}

fun forLoop(){

    /*
    var collection = Any{}
    for(item in collection)
        print()
    */

}

class MyIterator {
    val data = listOf(1,2,3,4,5)
    var idx = 0

    /*operator fun hasnext(): Boolean {
        return data.size > idx
    }*/

    operator fun next(): Int {
        return data[idx++]
    }

}

class MyData {
    /*operator fun iterator{}: MyIterator {
        return MyIterator{}
    }*/
}

// For Loops
//

