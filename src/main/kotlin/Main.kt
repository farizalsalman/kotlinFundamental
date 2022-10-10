fun main() {
    // Variable in kotlin
    var company: String = "Infinite learning" //(Nilai bisa di ubah)
    company = "Nongsa digital"
    println(company)

    val company2 = "Infinite learning" //(nilai tidak bisa di ubah)
    //company = "Nongsa digital"
    println(company2)

    //Tipe data bisa menggabungkan variable
    var pertama = "infinite"
    var kedua = "learning"
    println(pertama + " " + kedua)

    //Data type in kotlin (Character, String, Boolean, Numbers, Array)
    //type data character
    var grade: Char = 'A'
    //increment(++) dan decrement(--) operasi dalam tipe data char
    println("Grade "+ grade++)
    println("Grade "+ grade++)
    println("Grade "+ grade++)
    println("===========================")
    println("Grade "+ grade--)
    println("Grade "+ grade--)
    println("Grade "+ grade--)
}