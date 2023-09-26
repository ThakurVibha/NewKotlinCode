package src

//fun main() {
////    val result = add(4,5)
////    println(result)
////    val result2 = add(5,3)
////    println(result2)
////    evenOrOdd(12)
////    evenOrOdd(13)
//
//    printMessage(3) //argument
//    printMessage()
//}
//
//fun printMessage(count:Int = 2){//count parameter
//    for (i in 1..count){
//        println("Hello $i")
//    }
//}
//
//fun add(num1: Int,num2:Int):Int
//{
//    val sum = num1 + num2
//    return sum
//}
////inline function
////fun add(num1: Int,num2: Int): Int = num1 + num2
//
//fun evenOrOdd(num1: Int): Unit{
//    val result = if (num1 % 2==0) "Even" else "Odd"
//    println(result)
//}
//// In Kotlin By default return type called by "Unit"


fun main(){
    println(addition(1,1))
    println(addition(2.3,1.0))
}

fun addition(a:Int, b:Int): Int
{
    return a+b
}

fun addition(a:Double, b:Double):Double
{
    return a + b
}