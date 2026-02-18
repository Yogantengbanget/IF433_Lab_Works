package oop_00000122337_YogaValentinoSamputra_Week03

class Weapon (val name : String){
    var damage : Int = 0
        set(value){
            when {
                value < 0 -> {
                    println("Damage tidak boleh negatif")
                }
                value > 1000 -> {
                    println("Damage tidak boleh lebih dari 1000 (Overpowered")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}