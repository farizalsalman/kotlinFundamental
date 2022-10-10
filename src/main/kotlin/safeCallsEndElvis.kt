fun main(){
    val safeText: String? = null
    safeText?.length

    var dateOut: String? = null
    var status = "Booked"

    println("dateout = " + dateOut)
    println("status = " + status)
    println("------------------------------")

    status = "Checkout"

    if (status.equals("Checkout")) {
        dateOut = "28/10/2022 12:05:00"
    }

    println("dateout = " + dateOut)
    println("status = " + status)
}
