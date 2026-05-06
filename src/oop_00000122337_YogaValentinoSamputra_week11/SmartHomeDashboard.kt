package oop_00000122337_YogaValentinoSamputra_week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", "").apply {

        name = "Philips Wiz Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 5

    }.also{
        homeDevices.add(it)
    }
}