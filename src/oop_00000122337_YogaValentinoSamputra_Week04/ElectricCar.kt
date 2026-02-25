package oop_00000122337_YogaValentinoSamputra_Week04

class ElectricCar(brand : String, numberOfDoors : Int, val batteryCapacity : Int = 10) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }

}