package oop_00000122337_YogaValentinoSamputra_week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intbox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("=== TEST GENERIC CLASS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses : $result")

    println("=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5, 20)
    println("Total : ${math.sum()}")
    println("Terbesar : ${math.getMax(45, 90)}")



}