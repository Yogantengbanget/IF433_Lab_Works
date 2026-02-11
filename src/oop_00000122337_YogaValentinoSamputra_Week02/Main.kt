package oop_00000122337_YogaValentinoSamputra_Week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---");

    print("Masukan Nama : ")
    val name =  scanner.nextLine()

    print("Masukkan NIM(Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    }else {
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}