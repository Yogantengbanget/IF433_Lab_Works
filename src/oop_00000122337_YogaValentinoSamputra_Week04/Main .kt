package oop_00000122337_YogaValentinoSamputra_Week04

fun main () {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n---Testing Car ---")
    val myCar = Car ("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("--- Testing ElectricCar ---")
    val eCar = ElectricCar("Tesla", 2, 10)
    eCar.accelerate()
    eCar.honk()
    eCar.openTrunk()

    println("--- Testing Manager ---")
    val mngr = Manager("Yanto", 10000000)
    mngr.work()
    println("Bonusnya adalah ${mngr.calculateBonus()}")

    println("--- Testing Developer ---")
    val dvlp= Developer("Andi", 20000000, "C")
    dvlp.work()
    println("Bonusnya adalah ${dvlp.calculateBonus()}")
}