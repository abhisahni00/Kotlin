package basics

fun printFibonacciSeries(n: Int) {
    if (n < 0) {
        println("Input is negative. Please provide a non-negative integer.")
        return
    }

    if (n == 0) {
        println("Fibonacci series: []")
        return
    }

    val series = mutableListOf(0, 1)
    for (i in 2 until n) {
        series.add(series[i - 1] + series[i - 2])
    }

    println("Fibonacci series: ${series.take(n)}")
}

fun main() {
    println("Enter a number to generate Fibonacci series:")
    val input = readlnOrNull()
    val n = input?.toIntOrNull()

    if (n == null) {
        println("Invalid input. Please provide a valid non-negative integer.")
    }else{
        printFibonacciSeries(n)
    }
}
