fun main(){
    //The for loop can be performed using a range expression
    for (i in 1 .. 5){
        println("Value is $i")
    }

    //Can also use a for loop to iterate through the array
    val days = arrayOf("Monday", "Tuesday", "wednesday",
                        "Thursday", "Friday", "Saturday", "Sunday")
    for (day in days){
        println(day)
    }

    //Access the index for each element in Ranges using the withIndex() function
    val days2 = arrayOf("Monday", "Tuesday", "wednesday",
        "Thursday", "Friday", "Saturday", "Sunday")
    for ((index, value) in days2.withIndex()) {
        println("value $value with index $index")
    }

    //In addition to using the for keyword, for make the loop process can use the forEach extension.
    val days3 = arrayOf("Monday", "Tuesday", "wednesday",
        "Thursday", "Friday", "Saturday", "Sunday")
    days3.forEach {value ->
        println("Day is $value")
    }

    //If you want to get the index of each included value you can use the forEachIndexed extension.
    val days4 = arrayOf("Monday", "Tuesday", "wednesday",
        "Thursday", "Friday", "Saturday", "Sunday")
    days4.forEachIndexed { index, value ->
        println("day $value with index: $index")
    }
}