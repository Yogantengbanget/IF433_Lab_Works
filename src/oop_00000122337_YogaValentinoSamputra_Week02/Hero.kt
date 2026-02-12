package oop_00000122337_YogaValentinoSamputra_Week02

import java.util.Scanner

class Hero(val name: String, val baseDamage: Int, var hp: Int = 100){
    fun attack(targetName: String) {
        println("$name menebas $targetName")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if (hp < 0 ){
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}

class Monster(val name : String, var hp: Int, baseDamage: Int){
    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0){
            hp = 0
        }
    }
    fun isAlive(): Boolean{
        return hp > 0
    }
}

fun main () {
    val scanner = Scanner(System.`in`)

    print("Masukan nama Hero: ")
    val name = scanner.nextLine()

    print("Masukan base damage anda: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(name, baseDamage,hp = 100)

    val monster1 = Monster("Goblin", 40, 10)
    val monster2 = Monster("Orc", 70, 15)
    print("Pilih Musuh yang Ingin Diserang(1. ${monster1.name} 2. ${monster2.name})")
    val pilih  = scanner.nextInt()

    val target = if (pilih == 1) monster1 else monster2

    hero.attack(target.name)
    target.takeDamage(hero.baseDamage)

    println("${target.name} Hp sekarang ${target.hp}")

}