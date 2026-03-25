package oop_00000122337_YogaValentinoSamputra_Week07

fun main() {
    println("server: ${Koneksi.linkServer}")
    Koneksi.test_koneksi()

    Mahasiswa.nama = "udin"
    val na : Int = Mahasiswa.set_nilai(uts = 80, uas=100)
    println("Nilai ${Mahasiswa.nama} adalah $na")

    Mahasiswa.isi_nama_kampus("UMN")

    val dsn1 = Dosen("Indah","12345", 2020);
    println(dsn1);
    val dsn2 = dsn1.copy(nama = "Budi", nik="32154")
    println(dsn2)

    println("Nama dosen1 : ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}")

    println("Matkul fav saya " + MataKuliah.OOP.name);
    println("Matkul fav saya " + MataKuliah.OOP.ordinal);
    MataKuliah.OOP.sks_matkul()

    for(matkul in MataKuliah.entries){
        print("matkul: " + matkul + " ");
        matkul.sks_matkul()
    }


}