package oop_00000122337_YogaValentinoSamputra_Week07

enum class MataKuliah(val jmlSks : Int) {
    OOP(3),
    GAMEDEV(4),
    DASPRO(2);

    fun sks_matkul(){
        println("Jml sksnya : $jmlSks")
    }

}