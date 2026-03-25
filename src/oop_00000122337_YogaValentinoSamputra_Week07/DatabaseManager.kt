package oop_00000122337_YogaValentinoSamputra_Week07

object DatabaseManager {
    var connectionStatus : String = "Disconnected"

    fun connect (){
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}