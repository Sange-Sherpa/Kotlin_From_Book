package working_with_types

/*
interface Fax {
    fun call(number: String) = println("Calling $number")
    fun print(doc: String) = println("Fax: Printing $doc")
    fun answer()
}

class MultiFunction: Fax {
    override fun answer() {
        println("This is the function that overrides the above method.")
    }
}
*/

interface A {
    fun a() = println("This is interface A")
}

interface B {
    fun a() = println("This is interface B")
}

class Child : A, B {
    override fun a() {
        super<A>.a()
        super<B>.a()
        println("This is a child class")
    }
}

fun main() {
    val c = Child()
    c.a()
}