package oop_00000122337_YogaValentinoSamputra_Week02

import java.util.Scanner
import kotlin.random.Random

class Hero(val name: String, val baseDamage: Int, var hp: Int = 100){
    fun attack(targetName : String) {
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



fun main () {
    val scanner = Scanner(System.`in`)

    print("Masukan nama Hero: ")
    val name = scanner.nextLine()

    print("Masukan base damage anda: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(name, baseDamage)

    val enemyName = "Musuh"
    var enemyHp = 100

    println("===BATTLE START===")

    while (hero.isAlive() && enemyHp > 0 ){
        println("HP Hero : ${hero.hp}")
        println("HP musuh : $enemyHp")
        println("1.Serang")
        println("2.Kabur")
        print("Pilihan: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack(enemyName)
            enemyHp -= hero.baseDamage
            if (enemyHp < 0){
                enemyHp = 0
            }
            println("HP musuh tersisa: $enemyHp")
            if (enemyHp > 0){
                val enemyDamage = Random.nextInt(10,21)
                println("Musuh menyerang balik! Damage :$enemyDamage")
                hero.takeDamage(enemyDamage)
            }
        }else if (choice == 2){
            println("${hero.name} kabur dari pertempuran!")
            break
        }
    }
    println("===HASIL===")
    if (hero.hp > 0 && enemyHp <= 0){
        println("${hero.name} MENANG!")
    }else if(hero.hp >= enemyHp) {
        println("${hero.name} MENANG!")
    }else if (hero.hp <= 0){
        println("${hero.name} KALAH!")
    }else if (hero.hp <= enemyHp) {
        println("${enemyName} MENANG!")
    }else {
        println("pertarungan dihentikan")
    }


}