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