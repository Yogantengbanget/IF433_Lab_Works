package oop_00000122337_YogaValentinoSamputra_Week05

fun main(){
    val listMatkul: List<Matakuliah> = listOf(
        Wajib(),
        Elective(),
    );

    println("banyak tipe matkul: $listMatkul");

    for(mku in listMatkul){
        mku.set_matkul(3);

        if (mku is Wajib){
            mku.ada_seminar();
        } else if (mku is Elective){
            mku.ada_praktek();
        }

        when(mku){
            is Wajib -> {
                println("Wajib dari when")
                mku.ada_seminar()
            }
            is Elective -> {
                println("Elective dari when")
                mku.ada_praktek()
            }
        }

    }



//    val wjb = Wajib();
//    wjb.set_matkul(3);
//
//    val elc = Elective();
//    elc.set_matkul(2)
}