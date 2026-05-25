package oop_00000122337_YogaValentinoSamputra_Week14

interface Shape {
    fun area(): Int
}

class Rectangle(
    private val width: Int,
    private val height: Int
) : Shape {

    override fun area() = width * height
}

class Square(
    private val side: Int
) : Shape {

    override fun area() = side * side
}