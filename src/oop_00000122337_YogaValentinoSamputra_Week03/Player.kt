package oop_00000122337_YogaValentinoSamputra_Week03

class Player (val username : String) {
    private var xp: Int = 0

    val level: Int
        get()= (xp/100) + 1

    fun addXp(amount: Int){
        if (amount <= 0){
            println("xp tidak bisa negatif")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        if(newLevel > oldLevel){
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}