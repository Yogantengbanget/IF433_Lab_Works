class Pemain {
    var nama: String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot:Int = 8;

    init{
        nama = "Messi";
        println("Ini adalah constructor");
    }
    constructor(alias:String="Budi", kecepatan: Int = 2) {
        nama = alias;
        speed = kecepatan;
        println("Ini constructor kedua");
    }

    fun bawa_bola() {
        println("si $nama sedang bawa bola");
    }
}

fun main() {
    val player = Pemain(alias = "Yoel", kecepatan = 100);
    player.bawa_bola();
    println("nama pemain : ${player.nama}");
    println("skill Kecepatan: " + player.speed);
}
