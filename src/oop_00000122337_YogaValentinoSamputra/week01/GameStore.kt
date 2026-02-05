package oop_00000122337_YogaValentinoSamputra.week01

fun main(){
    val gameTitle = "GTA V"
    val price = 200000

    val finalPrice = calculateDiscount(price)

    val userNote : String? = null

    printRecipt(
        title = gameTitle,
        price = price,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount (price: Int): Int{
    var discountPrice: Int
    if (price > 500000)  {
        discountPrice = price - (price * 20/100)
    }else {
        discountPrice = price - (price * 10/100)
    }
    return discountPrice;
}

fun printRecipt (title: String,  price: Int, finalPrice: Int, note : String?){
    val safeNote = note ?: "Tidak ada catatan"

    println("Judul Game: $title")
    println("Harga Sebelum diskon: $price")
    println("Harga Akhir: $finalPrice")
    println("Catatan: $safeNote")
}
