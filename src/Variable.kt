//variable constan yang dapat diakses dari mana saja
const val APP = "Belajar Kotlin"
const val VERSION = "1.0.0"


fun main() {

    // val data tidak dapat diubah
    // var data dapat diubah

    val namaDepan = "Andri"
    var namaBelakang: String = "Saiful"
    println("Nama Lengkap = $namaDepan $namaBelakang")

    //perubahan data nama belakang
    namaBelakang = "Saiful Girsang"

    println("Nama Lengkap Setelah Ditambah = $namaDepan $namaBelakang")

    //variable bisa null
    var nama: String? = null
    println("Nama Belum Diisi = $nama")
    nama = "Aan Girsang"
    println("Nama Setelah Diisi = $nama")

    println("$APP : $VERSION")
}