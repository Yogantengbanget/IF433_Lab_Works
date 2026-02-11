package oop_00000122337_YogaValentinoSamputra_Week02

class Student (val name: String, val nim: String, val major : String){
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!" );
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        }else {
           print("LOG: Objek Student $name berhasil dialokasikan di Memory")
        }
    }
}