package oop_00000122337_YogaValentinoSamputra_Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("CreditCard ($accountName): Transaksi berhasil. Total terpakai: $usedAmount")
        } else {
            println("CreditCard ($accountName): Transaksi ditolak. Melebihi limit.")
        }
    }
}