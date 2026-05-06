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

    SmartDevice("Enviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")

        homeDevices.add(it)
    }

    val acDevice = run {
        SmartDevice("Daikin Inventer (Kabel Inventer (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acDevice)

    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let{
        println(it.diagnose())
    }

    with(homeDevices){
        println("=== SMART HOME SUMMARY===")

        println("Jumlah perangkat: ${this.size}")


    }

}