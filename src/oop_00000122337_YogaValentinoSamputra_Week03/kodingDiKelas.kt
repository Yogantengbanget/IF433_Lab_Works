package oop_00000122337_YogaValentinoSamputra_Week03

open class Bapake {
    private var nama: String = "Belum tau";
    private var umur:Int = 35;
    protected var gaji: Int = 1000000;

    public var uangjajan : Int = 0
        set(value){
            if(value <= 0 ){
                println("Masa uang jajan 0 atau minus")
            }else {
                field = value;
            }
        }
        get(){
            return field;
        }



    public fun set_nama(namabaru: String){
        if(this.nama.length <= 0){
            println("Eh nama gaboleh kosong")
        }else {
            this.nama = namabaru;
        }
    }

    public fun set_umur(umurbaru: Int){
        if(this.umur <= 0){
            println("Eh umur gaboleh kosong")
        }else {
                this.umur = umurbaru;
        }
    }

    public fun get_nama(): String{
        return this.nama
    }

    public fun get_umur(): Int{
        return this.umur
    }
}
class Anake : Bapake() {
    fun dapatin_gaji_bapak(): Int {
        this.gaji = 5500
        return this.gaji + 100;
    }
}



fun main() {
    var ank= Anake();
    ank.set_nama("Udin")
    println("Nama papi kamu ${ank.get_nama()}")
    println("Gaji Bapak : " + ank.dapatin_gaji_bapak())

    ank.uangjajan= -100
}





