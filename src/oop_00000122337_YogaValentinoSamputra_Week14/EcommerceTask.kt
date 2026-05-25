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

interface OrderRepository {

    fun saveOrder(
        itemName: String,
        price: Double
    )
}

class CsvOrderRepository(
    private val fileName: String
) : OrderRepository {

    override fun saveOrder(
        itemName: String,
        price: Double
    ) {

        File(fileName)
            .printWriter()
            .use { writer ->

                writer.println("$itemName,$price")
            }
    }
}

interface NotificationService {

    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(
        message: String
    ) {

        println("EMAIL: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
)