package oop_00000122337_YogaValentinoSamputra_week11

fun String.addGreeting(): String{
    return "Hellom $this"
}

fun String.repeatTimes(n: Int): String{
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean{
    return this == null || this.isEmpty()
}

