package oop_00000122337_YogaValentinoSamputra_Week07

import javax.xml.crypto.Data

fun main ( ) {
    println("===TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n===TEST COMPANION OBJECT===")
    val client = NetworkClient.createClient()
    client.connect()
}