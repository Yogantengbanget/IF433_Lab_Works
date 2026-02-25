package oop_00000122337_YogaValentinoSamputra_Week04

class Manager(name : String, baseSalary : Int) :Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimpin rapat divisi")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}