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

}