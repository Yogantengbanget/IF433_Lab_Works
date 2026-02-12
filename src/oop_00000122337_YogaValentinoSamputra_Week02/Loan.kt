package oop_00000122337_YogaValentinoSamputra_Week02

import java.util.Scanner


class Loan(val bookTitle: String, val borrower: String, val loanDuration: Int = 1) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        }else {
             0
        }
    }
}

fun main () {
    val scanner = Scanner(System.`in`)

    print("Masukan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukan Nama Anda: ")
    val borrower = scanner.nextLine()

    print("Masukan durasi peminjaman: ")
    var loanDuration = scanner.nextInt()

    if (loanDuration <= 0) {
        loanDuration = 1;
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println("===Detail Peminjaman===")
    println("Nama Buku: ${loan.bookTitle}")
    println("Nama Peminjam: ${loan.borrower}")
    println("Lama Peminjaman: ${loan.loanDuration} hari")
    println("Total Denda : ${loan.calculateFine()}")

}

