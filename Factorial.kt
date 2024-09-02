package basics

fun printFactorial(n: Int) {



    if (n < 0) {
        println("Input is negative. Factorial is not defined for negative numbers.")
        return
    }

    val factorial = calculateFactorial(n)
    println("Factorial of $n is: $factorial")
}

fun calculateFactorial(n: Int): Int {
    if (n == 0 || n == 1) return 1
    var result = 1
    for (i in 2..n) {
        result *= i
    }
    return result
}

fun main() {
    println("Enter a number:")

    val input = readlnOrNull()
    val n = input?.toIntOrNull()

    if (n == null) {
        println("Invalid input. Please provide a valid non-negative integer.")
    }else{
        printFactorial(n)
    }
}