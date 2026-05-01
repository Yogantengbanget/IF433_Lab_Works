package oop_00000122337_YogaValentinoSamputra_week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 50.0))
    coinRepo.add(Coin("ETH", 12.15))
    coinRepo.add(Coin("USDT", 1500.20))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

}