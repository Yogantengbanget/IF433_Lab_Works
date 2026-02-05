package oop_00000122337_YogaValentinoSamputra.week01

fun main ( ) {
    val radius=7.0
    val pi = 3.14

    var area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println("${checkSize(area)}")

    var b : String? = "ABC"
    b = null

    println(b)
}

fun checkSize(area: Double) = if(area > 100) "This is a Big Circle" else "This is a Small Circle"