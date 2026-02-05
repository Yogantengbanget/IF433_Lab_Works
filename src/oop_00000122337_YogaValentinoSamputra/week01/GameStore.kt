package oop_00000122337_YogaValentinoSamputra.week01

fun main(){
        val gameString = "GTA V"
        val price = 200000

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

fun printRecipt (title: String, finalPrice: Int){

}
