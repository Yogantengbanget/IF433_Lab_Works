package oop_00000122337_YogaValentinoSamputra_Week06

interface Organisasi {
    val namaOrg:String;
    val budgetRapat:Int;
    val jmlOrg:Int;
    val biayaKonsumsi:Int
        get() = budgetRapat * jmlOrg
    fun rapat();
    fun keaktifan() {
        println("Ih kamu aktif")
    }
}