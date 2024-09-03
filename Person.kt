
class Person {
    var name: String
    var age: Int

    constructor(x: String, y: Int) {
        this.name = x
        this.age = y
    }

    constructor(x: String) {
        this.name = x
        this.age = 0
    }

    constructor() {
        this.name = "Rahul"
        this.age = 32
    }


    fun intro() {
        println("my name is $name and age is $age")
    }
}

fun main() {
    var a=Person("Riya",22)
    a.intro()
    var b=Person()
    b.intro()
    var c=Person("Heena")
    c.intro()
}