package oop_00000122337_YogaValentinoSamputra_Week14

import java.io.File

class BadOrderProcessor {

    // VIOLATION: Hardcoded File I/O (DIP),
    // melakukan kalkulasi + I/O + notifikasi sekaligus (SRP)

    private val file = File("orders.csv")

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String
    ) {

        // OCP violation
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText(
            "$itemName,$finalPrice,$customerType\n"
        )

        println(
            "Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}