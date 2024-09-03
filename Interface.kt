package basics

interface Shape{
    fun area():Double
}
open class R1(val a:Double, val b:Double):Shape{
    override fun area():Double{
        return a*b
    }
    open fun display(){
        println("area of rectangle with dimensions $a*$b is ${area()}")
    }
}
class S1(side:Double):Rectangle(side,side){
    override fun display(){
        println("area of square with side $a is ${area()}")
    }
}

fun main() {
    val myRectangle=R1(4.0,5.0)
    myRectangle.display()
    val mySquare=S1(3.0)
    mySquare.display()
}
