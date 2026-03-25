package oop_00000122337_YogaValentinoSamputra_Week07

import kotlin.time.DurationUnit

class Mahasiswa private constructor(val kampus : String){
    companion object {
        var nama: String ="unknown"

        fun set_nilai(uts: Int, uas :Int ):Int{
            return (uts+uas)/2
        }
        fun isi_nama_kampus(namaUniv: String) {
            Mahasiswa (namaUniv);
        }
    }
    init {
        println("nama kampus kamu adalah $kampus")
    }


}