package oop_00000122337_YogaValentinoSamputra_Week05

class EWallet (accountName : String, var balance : Double): PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("EWallet ($accountName): Pembayaran berhasil. Sisa saldo: $balance")
        } else {
            println("EWallet ($accountName): Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double){
        balance += balance
        println("EWallet ($accountName): Top up berhasil. Saldo sekarang: $balance")
    }
}