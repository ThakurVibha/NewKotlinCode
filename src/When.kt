package src

fun main(){
//    val number = 5
//    val result = number in 1..5//1,2,3,4,5 //1 until 5 (upper bound doesn't include)
//    println(result)
    val animal = "Dog"
    val result = when(animal){
        "Horse" -> ("Animal is Horse")
        "Cat" -> ("Animal is Cat")
        "Dog" -> ("Animal is Dog")
        else -> ("Animal not found")
    }
    println(result)
}