fun main () {
    val day = 1

    val result = when (day) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "invalid"
    }

    println(result)

    val hari = 2

    when (hari) {
        1, 2, 3, 4, 5 -> println("weekday")
        else -> println("weekend")
    }

    val waktu = 2

    when (waktu) {
        1 -> {
            println("Firts day of the week")
            println("Monday")
        }
        2 -> {
            println("Second day of the day")
            println("Thuesday")
        }
        3 -> {
            println("Third day of the day")
            println("Wednesday")
        }
        4 -> println("Thusday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day.")
    }
}