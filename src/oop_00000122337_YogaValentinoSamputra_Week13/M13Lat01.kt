package oop_00000122337_YogaValentinoSamputra_Week13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

data class Mahasiswa(val nim: String, val nama: String, val nilai: Int){
    fun simpanDanConvertCSV(): String {
        return "$nim, $nama, $nilai"
    }
}

fun main(){
    println("=== Cara2 - Buat File===")
    val mhs = Mahasiswa("111","Christopher", 84)

    val listMhs:List<Mahasiswa> = listOf(
        Mahasiswa("111", "Andhika", 83),
        Mahasiswa("222", "Vilbert", 86),
        Mahasiswa("333", "Yoga", 84)
    )



    val file5 = File("src/oop_00000122337_YogaValentinoSamputra_Week13/data_rahasia_Mahasiswa.csv")
    file5.writeText(listMhs.joinToString("\n"){
        it.simpanDanConvertCSV()
    })


    println("=== Cara1 - Baca isi File===")
    val file1 = File("src/oop_00000122337_YogaValentinoSamputra_Week13/contoh.txt")
    val isiContent = file1.readText()
    println(isiContent)

    println("\n=== Cara2 - Baca isi File===")
    val contentSaya = file1.readLines()
    contentSaya.forEach {
        println(it)
    }

    println("\n=== Cara3 - Baca isi File===")
    val file2 = BufferedReader(FileReader("src/oop_00000122337_YogaValentinoSamputra_Week13/contoh.txt"))
    var isiFile: String? = file2.readLine()
    while (isiFile != null){
        println(isiFile)
        isiFile = file2.readLine()
    }
    file2.close()


    println("\n=== Cara4 - Baca isi File===")
    val file3 = File("src/oop_00000122337_YogaValentinoSamputra_Week13/contoh.txt").bufferedReader()
    file3.use{
        it.lineSequence()
            .filter { it.isNotEmpty() }
            .forEach { println(it) }
    }


    println("\n=== Cara1 - Buat File ===")
    val fileSaya = File("src/oop_00000122337_YogaValentinoSamputra_Week13/fileYoga.txt")
    fileSaya.writeText("私はウィラワです\n Saya suke ke pasar\n Beli buah dan sayur")

    fileSaya.appendText("\nUntuk Ayah dan Ibu")


    val listBelanjaan = listOf("Ayam","Pisang", "Beras")
    fileSaya.appendText("\n" + listBelanjaan.joinToString("\n"))

    //ini akan menimpah
    fileSaya.printWriter().use {
        it.println("Saya kuliah di UMN")
        it.println("UMN Kampus Keren")
        it.println("Saya jurusan IF")
    }












}