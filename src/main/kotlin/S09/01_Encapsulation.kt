package S09

fun main() {

    val memberA = MemberV1("memberA", 10, 3)

    println("memberA.name = ${memberA.name}")

    memberA.name = "memberB"
    println("memberA.name = ${memberA.name}")

    val memberB = MemberV2("memberA", 10, 3)

    println("memberA.name = ${memberB.name}")

//    memberB.name = "memberB"
//    println("memberA.name = ${memberB.name}")

    val memberC = MemberV3("memberA", 10, 3)
    memberC.grade = 0

    println("memberC.grade = ${memberC.grade}")


}

class MemberV1(var name: String, var age: Int, var grade: Int)

class MemberV2(val name: String, val age: Int, val grade: Int)

class MemberV3(val name: String, val age: Int, grade: Int) {

    var grade: Int = grade
        set(value) {
            field = if ( value <= 0 ) 1 else value
        }

}




