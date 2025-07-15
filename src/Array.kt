fun main() {

    val names: Array<String> = arrayOf("Aan", "Cici", "Hadi")
    names[0] = "Aan Girsang"

    println(names[0])

    val nilais: Array<Int> = arrayOf(80,90,98)
    println(nilais[0])
    println(nilais[1])
    println(nilais[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Aan"
    members[2] = "Cici"
    members[4] = "Hadi"

    println(members[0])
    println(members[1])
    println(members[2])
    println(members[3])
    println(members[4])


}