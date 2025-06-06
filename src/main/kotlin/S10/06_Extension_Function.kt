package S10

fun main() {

    println("happy happy".printUpperCase())

    1.printPrice()
    10.customSum(20)

    val sentence = "Hello World!"
    sentence.printUpperCase()

    val order1 = EfCoffeeOrder("아메리카노", "T")
    order1.printPrice()

    order1.changeSize("G")

}

fun Int.customSum(target: Int) {
    println("두 값을 더하면 = ${this + target}")
}

fun Int.printPrice() {
    println("가격 : ${this}")
}

fun String.printUpperCase() {
    println(this.uppercase())
}

class EfCoffeeOrder(var type: String, var size: String) {
    fun printPrice() = when(size) {
        "T" -> println("$type $size 는 3000원입니다.")
        "G" -> println("$type $size 는 3500원입니다.")
        else -> println("사이즈가 잘못되었습니다.")
    }
}

interface A {
    fun printName() {

    }
}

class C : A {
    override fun printName() {}
}






