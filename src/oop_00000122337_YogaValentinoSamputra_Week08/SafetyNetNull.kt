package oop_00000122337_YogaValentinoSamputra_Week08

fun main(){
    var nama: String? = null

    try{
        println("nama kamu ${nama!!.uppercase()}")
    }catch(ex: NullPointerException){
        println("Errornya adalah ${ex.message}")
    }

    var dataMhs:List <Any> =  listOf(123, "Wirawan",89,"Tangerang" )
    for (item in dataMhs){
        var itemFilter = item as? String
        if(itemFilter != null) {
            println(itemFilter);
        }
    }
}