fun main() {
    //Boolean
    var a = true //bukan string karna ga pake ""
    var b = false
    println("a && b = " + (a && b))
    println("a || b = " + (a || b))
    println("!b = " + (!b))
    println()
    // Boolean expresion
    val x = 50
    val y = 25
    println("x > y = " + (x > y))
    println("x < y = " + (x < y))
    println("x >= y = " + (x >= y))
    println("x <= y = " + (x <= y))
    println("x == y = " + (x == y))
    println("x != y = " + (x != y))
    println()
    // Boolean Functions
    val X: Boolean = true
    val Y: Boolean = false
    val Z: Boolean = true
    println("X.and(Y) = " + X.and(Y))
    println("X.or(Y) = " + X.or(Y))
    println("X.and(Y) = " + X.and(Z))
}