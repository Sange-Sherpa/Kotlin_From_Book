/**
 * Getters and Setters

class A {
    private var name: String? = "John"

    fun getName() = name
    fun setName(name:String) {
        this.name = name
    }
}

fun main() {
    var a = A()
    println(a.getName())
}
 **/


// Constructors

class Construct(name: String, age: Int) {
    var name = name
    var age = age


    override fun toString(): String {
        return "$name"
    }
}


fun main() {
   val c = Construct("Mike", 21)
    print(c)
}