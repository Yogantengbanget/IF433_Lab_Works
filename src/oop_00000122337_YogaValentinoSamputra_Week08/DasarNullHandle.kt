package oop_00000122337_YogaValentinoSamputra_Week08

class set_krs(val nim: String?, val kodematkul:String?){
    fun matkul_wajib(sks: Int?){
        println("matkul kamu adalah $kodematkul dan sks-nya adalah $sks")
    }
}

fun main() {
    var nama : String? = "Yoga Valentino Samputra"
    nama = null
    println("hai $nama")

    val settingKRS = set_krs("123", "null");
    println("NIM kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}")
    settingKRS.matkul_wajib(null)
}
