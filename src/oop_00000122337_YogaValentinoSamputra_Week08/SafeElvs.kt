package oop_00000122337_YogaValentinoSamputra_Week08

class Alamat(val nomor:Int, val kota: String);
class Mahasiswa(val nim: String, val addr: Alamat?)

fun main(){
    val almt = Alamat(47, "Tanggerang")
    val mhs = Mahasiswa("12345", null)


    val defaultAlamat = mhs.addr?.let{
        alamatAsli -> "sini nih... ${mhs.addr.kota} nomornya ${mhs.addr.nomor}"
    }?:"Gak jelas, ga tau dimana"

    println("Nim-nya ${mhs.nim} tinggalnya di ${defaultAlamat}")
}

