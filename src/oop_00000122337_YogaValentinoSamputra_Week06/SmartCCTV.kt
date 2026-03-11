package oop_00000122337_YogaValentinoSamputra_Week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("SmartCCTV $name dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("SmartCCTV $name dimatikan.")
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam.")
    }
}