package oop_00000122337_YogaValentinoSamputra_Week06

class SmartLamp (override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampi $name dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu $name dimatikan.")
    }
}