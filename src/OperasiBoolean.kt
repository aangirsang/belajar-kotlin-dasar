fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 70

    val lulusUjuan = nilaiUjian > 75
    val lulusAbsen = nilaiAbsen > 75

    val apakahLulus = lulusAbsen && lulusUjuan

    println(apakahLulus)

}