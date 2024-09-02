package basics

fun cToF(c: Double):Double{
    return (9*c/5)+32
}

fun fToC(f: Double):Double{
    return (f-32)*5/9
}

fun main() {
    println("Enter the temperature (in celsius) to convert (in fahrenheit):")
    val inputC = readlnOrNull()?.toDoubleOrNull()
    println("Enter the temperature (in fahrenheit) to convert (in celsius) :")
    val inputF = readlnOrNull()?.toDoubleOrNull()
    if (inputC == null || inputF == null) {
        println("Invalid input. Please provide a valid value.")
    }else{
        println(cToF(inputC))
        println(fToC(inputF))
    }


}