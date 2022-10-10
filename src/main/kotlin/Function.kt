fun main(){
    val hasil = setUser("Ali", 22)

    println(hasil)
}

fun setUser(name: String, age: Int): String {
    return "nama kamu adalah $name, dan umur kamu $age tahun"
}