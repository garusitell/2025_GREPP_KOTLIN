package S03

fun main() {

    val s1: String? = "Hello, World!"
//    val result1: Int = s1.length
//    println("result1 = ${result1}")
//    val result1: Int = s1?.length
    val result1: Int? = s1?.length

    println("result1 = $result1")

    val s2: String? = null
    val result2 = s2?.length
    println("result2 = $result2")

    var s3: String? = "Hello, World!"
    val result3 = s3 ?: "Bye"
    println("result3 = $result3")

    s3 = null
    val result4 = s3 ?: "Bye"
    println("result4 = $result4")

    val s5: String? = null
    val result5 = s5!!.length
    println("result5 = $result5")


}