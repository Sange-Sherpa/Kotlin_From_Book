import kotlin.test.assertIs

/**

fun connectToDb(
hostname: String = "localhost",
username: String = "admin",
password: String = "admin002"
) {
println("$hostname $username $password")
}

fun main() {
connectToDb("123.21.311", "MyComputer", "pass")
connectToDb()
connectToDb(username = "San", hostname = "local", password = "002")
// Functions with default values can be called like this. Unlike Java.
}

 */

/**

fun<T> manyParams(vararg vals: T) {
for (i in vals) println(i)
}

fun main() {
manyParams(1, 2, 3, 4, 5, 10)
manyParams(*"Hellothere".split(" ").toTypedArray())
}

 */

// Extension Functions
/**
 * add behavior to an existing class, without using inheritance.
 * introduces the concept of receiver type and receiver object.
 */

/*
class Student {
    fun isPass(marks: Int): Boolean {
        return marks > 40
    }

    fun isExcellent(marks: Int): Boolean {
        return marks > 90
    }
}

fun Student.isFail(marks: Int): Boolean {
    return marks < 40
}

fun main() {
    val st = Student()
    val mark = true
//    println(st.isPass(50))
//    println(st.isExcellent(50))

    when(mark) {
        st.isExcellent(10)-> print("Excellent")
        st.isPass(10) -> println("passed")
        st.isFail(10) -> println("Student has failed")
        else -> println("Nothing")
    }
}

*/

// Infix Functions
// Can be infix-ed -> kept at middle without operator / brackets

/*
class Person(val name: String) {
    infix fun say(msg: String) = println("$name is saying $msg")
}

fun main() {
    val person = Person("John")
    person say "hello"
}

*/
