package basics

fun main(){
    val num = 9
    when{
        num %2==0 -> println("$num is even")
        num %2!=0 -> println("$num  is odd")
    }
}