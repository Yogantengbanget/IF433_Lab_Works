package oop_00000122337_YogaValentinoSamputra_week11

fun panggil_nama(nama:String):String{
    return "Hai $nama"
}

fun String.panggil_mahasiswa():String{

    var hasil = this.split(" ").joinToString (" "){
        it.replaceFirstChar{
            c -> c.uppercase()
        }
    }
    return hasil

}

fun Int.tentukanLulus(nama: String): String{
    var keputusan = "";
    if(this >= 70){
        keputusan = "Lulus"
    }else {
        keputusan = "Remedial"
    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan"
}

fun String?.cekNulldanEmpty():String {
    if(this == null || this.isEmpty()){
        return "gak boleh null atau kosong bang"
    }else {
        return "username kamu adalah $this"
    }

}

class Mahasiswa(){
    var nim: String = ""
    var nama: String = ""
    var ipk:Int = 0
}


fun main(){
    var inputUsername: String? = null
    println(inputUsername.cekNulldanEmpty())

    println(80.tentukanLulus("Revan"));

    println(panggil_nama("Toni").uppercase())

    println("Tonnyyyyyy stark iron man".panggil_mahasiswa())


    //SCOPE - LET
    var kampusSaya = "UMN"
    kampusSaya.let{
        if(it == "UMN") {
            println("Kampus $it Keren")
        }else {
            println("Amazing $it")
        }
    }

    //SCOPE - RUN
    var alamatSaya = "Gading Serpong"
    alamatSaya.run{
        println("Saya tinggal this $this")
    }

    //SCOPEE - WITH
    var gradeSaya = with(receiver = 98){
        if (this >= 80){
            "A"
        }else if (this >= 70){
            "B"
        }else {
            "C"
        }
    }
    println("Grade kamu adalah $gradeSaya")


    //SCOPEE - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        nim = "12345";
        nama = "Yudi";
        ipk = 3;
    }
    println("Mahasiswa ${dataMahasiswa.nama} dengan nim ${dataMahasiswa.nim} ipknya ${dataMahasiswa.ipk}")


    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80,70,75,68,85)
    deretAngka.also{
        println("Sebelum $deretAngka")
    }.add(98)
    println("Setelah $deretAngka")
}