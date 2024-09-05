package basics

fun main() {
    println("Purchase Amount: ")
    val Purchase = readln().toInt()
    println("Do you have member ship?")
    val Membership = readln().toBoolean()
    if (Purchase>=1000){
        if(Membership){
            print("Got 20% discount")
        }
        else{
            println("Got 10% discount")
        }

    }else{
        println("No discount")
    }
}
