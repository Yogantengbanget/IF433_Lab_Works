package oop_00000122337_YogaValentinoSamputra_Week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456");
    val admin1 = Admin("Bu Siti")

    val daftarpegawai : List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarpegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen(NIDN : ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }
    println("----------------------")

    val mathHelper = MathHelper();

    val luasPersegi = mathHelper.hitungLuas(4)
    println("Luas perseginya adalah $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
    println("Luas persegi panjangnya adalah $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas ingkarannya adalah $luasLingkaran")
}

