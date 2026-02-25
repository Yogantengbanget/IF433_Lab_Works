package oop_00000122337_YogaValentinoSamputra_Week03

fun main() {
    val w = Weapon("Pisau");
    val p = Player("Veto");

    w.damage = -50
    w.damage = 9999

    println("${w.tier}")


    p.addXp(50);
    p.addXp(60);
}