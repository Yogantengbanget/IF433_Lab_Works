package oop_00000122337_YogaValentinoSamputra_Week04

class Developer (name : String, baseSalary : Int, val programmingLanguage : String) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

}