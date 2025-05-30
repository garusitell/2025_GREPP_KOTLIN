package S04

fun main() {

    // as
    val target1: Any = "Hello World!"
    val strTarget1: String = target1 as String
    println("strTarget1 type = ${strTarget1.javaClass.simpleName}")

//    val intTarget = target1 as Int

    val target2: Any = 100
    val strTarget2: String? = target2 as? String
    println("strTarget2 = ${strTarget2}")

    val itemList: List<Any> = listOf("망고",  100, "사과", 200, "딸기", true)
    printStr(itemList)

}

fun printStr(target: List<Any>) {
    for ( i in target ) {
        val iStr = i as? String
        if ( iStr != null ) {
            print("$iStr ")
        }
    }
    println()
}

