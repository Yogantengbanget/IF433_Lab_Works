package oop_00000122337_YogaValentinoSamputra_Week06

class Button(override val name: String) : Clickable {
    override fun click(){
        println("Tombol '$name' berhasil diklik!")
    }
}
