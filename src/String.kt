fun main() {

    val namaDepan = "Aan"
    val namaBelakan = "Girsang"

    val alamat = """
        |Perumahan Green City,
        |Blok I No. 14,
        """.trimMargin()

    val namaLengkap = "$namaDepan $namaBelakan"
    val desc = "Panjang Nama $namaLengkap Adalah ${namaLengkap.length} Karakter"

    println(namaLengkap)
    println("Alamat : $alamat")
    println(desc)
}
