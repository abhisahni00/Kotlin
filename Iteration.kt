package basics

fun main(){
    val fruits = listOf("Apple","Banana","CHerry")
    for (fruit in fruits){
        println("Fruits: $fruit")
    }
    for (i in fruits.indices){
        println("$i :${fruits[i]}")
    }
}