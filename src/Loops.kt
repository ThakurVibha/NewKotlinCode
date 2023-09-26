package src

fun main() {
    //While Loop
//    var count = 5
//    while(count>=1)
//    {
//        println("Hello Sumit")
//        count --
//    }

    //Do While Loop
//
//    var index = 5
//    do {
//        println("Hello")
//        index++
//    }while (index > 5)

//    for(i in 1..5 step 2){
//        println(i)
//    }
//
//    println("Until")
//    for (i in 1 until 5){
//        println(i)
//    }
//
//    for (i in 10 downTo 1){
//        println(i)
//    }

    val number = 2
    for (i in 1..10)
    {
        // 2 x 1 = 2
        // 2 x 2 = 4
        //String Templating
        println("$number x $i = ${number * i}")
    }
}