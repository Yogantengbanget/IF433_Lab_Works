package oop_00000122337_YogaValentinoSamputra_week09

fun main(){
    println("========= LIST OF =========")
    val arSiswa = listOf("Budi","Danu","Suci","Cica");

    //view
    println(arSiswa)

    //panjang array
    println(arSiswa.size)

    //munculin satu orang aja
    println("siswa bernama ${arSiswa[1]}")

    //foreach
    for(a in arSiswa){
        print("Siswa " + a + " dan ")
    }

    println("\n========= LIST OF MUTABLE =========")
    val arMatkul = mutableListOf("OOP", "Pemweb", "Matdis", "Kalkulus");
    arMatkul.add("Algo")
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove("Pemweb");
    println(arMatkul);

    println("\n========= SET OF IMUT =========");
    val arNilai = setOf(80,90,75,85,80,30,50,85);
    println("banyak nilai: ${arNilai.size}")
    println("ada angka 90 gak? ${arNilai.contains(90)}")
    println(arNilai)

    println("========= SET OF IMUT =========");
    val arMahasiswa = mutableSetOf("Andi", "Yanto", "Udin", "Yuda")
    arMahasiswa.add("Yanti")
    arMahasiswa.remove("Udin")
    arMahasiswa.add("Udin")
    println(arMahasiswa);

    println("========= MAP OF IMUT =========");
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 3000,
        "Sayur Asem" to 2500
    );
    println("Banyak menu ${arResto.size}")
    println("Harga ayam ${arResto["Ayam"]}")
    println("List makanan ${arResto.keys}")
    println("List harga ${arResto.values}")
    println(arResto);

    println("========= MAP OF MUTABLE =========");
    val arKHS = mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    );
    arKHS.remove("Ara");
    arKHS["Nika"] = 92
    arKHS["Cinta"] = 99
    println(arKHS)

    println("========= LAMBDA =========");

    fun tambah(a:Int, b:Int):Int {
        return a + b
    }
    println ("hasil pertambahan ${tambah(5, 3)}")
    val kurang = {a:Int, b:Int -> a-b}
    println("Hasil pengurangan${kurang(5,3)}");

    println("========= LAMBDA IT =========");
    val pangkat = {a:Int, -> a*a}
    val hasilPangkat:(Int) -> Int = {it * it}
    println("Hasil pangkat ${hasilPangkat(5)}")

    println("========= FOREACH BIASA =========");
    for(a in arMatkul){
        println(a)
    }

    println("========= FOREACH IT =========");
    arMatkul.forEach {
        println(it)
    }

    println("========= FOREACH VARIABEL =========");
    arMatkul.forEach {
        mk -> println(mk)
    }

}
