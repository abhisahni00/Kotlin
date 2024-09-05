package basics

fun main() {

    var InitialBalance = 1000
    var shouldWithdraw = "yes"
    while (shouldWithdraw == "yes") {

        println("Enter amount to withdraw:")
        val Withdraw = readln().toInt()
        if (InitialBalance < Withdraw) {
            println("Insufficient Balance!")
        } else {
            InitialBalance -= Withdraw
            println("Amount After withdrwal: $InitialBalance")
        }
        println("want to withdraw again")
        shouldWithdraw = readln()
        if (shouldWithdraw =="no"){
            println("Thankyou")
            break;
        }

    }
}