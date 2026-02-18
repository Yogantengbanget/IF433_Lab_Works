package oop_00000122337_YogaValentinoSamputra_Week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasesPerformance()


    println("Pajak yang harus dibayar: ${e.tax}")
}