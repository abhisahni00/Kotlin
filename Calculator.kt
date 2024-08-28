package basics

fun main() {
    val a = 10
    val b = 20
    val ope = '*'
    val answer : Int
    if (ope == '+'){
        answer = a+b
    }
    else if (ope == '-'){
        answer = a-b
    }
    else if (ope == '*'){
        answer = a*b
    }
    else if (ope == '/'){
        if(b==0){
            println("Error")
            answer = 0
        }

    }


}