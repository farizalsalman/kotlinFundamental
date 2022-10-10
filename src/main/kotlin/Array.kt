fun main() {
    var group = arrayOf<String>("group 1", "group 2", "group 3", "group 4")
    group = arrayOf("tim 1", "tim 2")
    //atau bisa tidak memakai <string>

    println(group[0])
    println(group.get(1))
    println("------------------")
    println()

    group[0] = "group satu"
    group.set(1, "group dua")

    println(group[0])
    println(group.get(1))
    println("------------------")
}