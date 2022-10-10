fun main() {

    //using..
    val rangeInt = 1..10
    println("Step : " + rangeInt.step)
    println(rangeInt.toList())

    //using .rangeTo()
    val rangeInteger = 1.rangeTo(10)
    println("Step : " + rangeInteger.step)
    println(rangeInteger.toList())

    //using for & ..
    for (i in 1 .. 5) {
        println("Awkawkawkawk")
    }

    //using rangeTo()
    var i = 4
    if (i in 1.rangeTo(10)) {
        println("Value 4 available in range")
    }

    //using downTo()
    var u = 20
    if(u !in 10.downTo(1)) {
        println("Value 4 is not available in range")
    }

}