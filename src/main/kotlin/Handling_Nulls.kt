fun printArr(arr: Array<Int>?) {
    arr?.forEach { i -> println(i) }
}

fun main() {
    var a = arrayOf(1,2,3)
    printArr(null)
}