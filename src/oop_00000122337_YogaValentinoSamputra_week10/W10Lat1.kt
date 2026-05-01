package oop_00000122337_YogaValentinoSamputra_week10

//code Non-Generi
class rumah(val alamat: Any)

class kampus<T>(val alamat : T)

class Komputer<T,V>(val merk:T, val barcode:V)

fun <T> Password(isiPass : T):T {
    return isiPass;
}

class kalkulator<T: Number>(val a:T, val b:T){
    fun tambah(): Int{
        return a.toInt() + b.toInt()
    }
    fun kurang(): Double{
        return a.toDouble() - b.toDouble()
    }
}

fun<T> penilaian(list : List<T>, kkm:T):List<T> where T: Comparable<T>{
    return list.filter {it >= kkm};
}

fun main () {
    println("\n=====GENERIC - WHERE =====")
    val daftarNilai = listOf(60, 71, 90, 83, 73, 67, 55, 84, 72)
    println("Daftar nilai: " + daftarNilai)
    val nilaiAtasKKM = penilaian(daftarNilai, 70)
    println("Nilai diatas KKM: " + nilaiAtasKKM);


    println("\n=====GENERIC - CONSTRAINT =====")
    val kalk = kalkulator(10.52, 20.347)
    println ("Penambahan ${kalk.a} ditambah ${kalk.b} : " + kalk.tambah())
    println ("Peng urangan ${kalk.a} dikurang ${kalk.b} : " + kalk.kurang())

    println("\n=====GENERIC - FUNCTION =====")
    println("Password kamu ${Password("12345")}")

    println("\n =====SAMPLE GENERIC - MULTI PARAM =====")
    val komp = Komputer("Asus", "IH12345")
    println("Merk komputer : " + komp.merk)
    println("Barcode komputer : ${komp.barcode}")

    println("\n =====SAMPLE NON GENERIC =====")
    val rmh= rumah(alamat = 200)
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("\n =====SAMPLE GENERIC =====")
    val kmps = kampus(alamat = 300)
    println(kmps.alamat + 50)
}