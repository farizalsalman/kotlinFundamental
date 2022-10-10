fun main() {
    val listInt = listOf(1, 2, null, 4, 5, null, 7)

    for (i in listInt) {
        if (i == null) continue
        println(i)
    }

    println("Print odd number")
    for (i in 1 .. 10) {
        if (i % 2 == 0) {
            continue
        }
        println("$i is an odd number")
    }
}