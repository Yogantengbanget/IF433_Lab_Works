package oop_00000122337_YogaValentinoSamputra_week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 50.0))
    coinRepo.add(Coin("ETH", 12.15))
    coinRepo.add(Coin("USDT", 1500.20))
}