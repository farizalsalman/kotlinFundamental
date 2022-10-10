
open class Ucapan {
    fun pesan () {
        print("Selamat Belajar")
    }
}
class Selamat: Ucapan(){ // pewarisan terjadi menggunakan konstruktor default
}
fun main() {
    var view = Selamat()
    view.pesan()
}