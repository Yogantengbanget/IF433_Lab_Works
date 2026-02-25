package oop_00000122337_YogaValentinoSamputra_Week04

class Pasta : Makanan() {
    private var toping: String = "";
    public fun pasta_terjual(jml: Int){
        this.toping="nora";
        super.harga = jml * 120;
        println("Pasta $toping laris $harga");

    }
    override public fun jual_makanan() {
        println("Saya jual PASTA enak");
    }
}