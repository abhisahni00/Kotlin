package basics

fun main(){
    for (i in 1..5){
        println("Number: $i")

    }
    println("______")

    for (i in 1 until 5){
        println("Number: $i")
    }
    println("_____")
    for (i in 5 downTo 1){
        println(i)
    }
    println("_______")
    for (i in 5 downTo 1 step 2){
        println(i)
    }
}