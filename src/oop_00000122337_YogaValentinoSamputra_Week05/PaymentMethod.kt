package oop_00000122337_YogaValentinoSamputra_Week05

abstract class PaymentMethod (val accountName : String) {

    abstract fun processPayment(amount : Double);

}