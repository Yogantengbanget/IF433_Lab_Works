package oop_00000122337_YogaValentinoSamputra_week12

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(
    requested: Int,
    available: Int
) : FeederException(
    "Kibble tidak cukup! Diminta $requested gr, sisa $available gr"
)

class DispenserJamException :
    FeederException("Wadah dispenser tersangkut/macet!"){
    fun dispenseKibble(
        requestedGram: Int,
        availableGram: Int,
        isJammed: Boolean
    ): Int {

        require(requestedGram > 0) {
            "Porsi kibble harus lebih dari 0 gr"
        }

        if (isJammed) {
            throw DispenserJamException()
        }

        if (requestedGram > availableGram) {
            throw FoodEmptyException(requestedGram, availableGram)
        }

        println("Kibble berhasil dikeluarkan!")

        return availableGram - requestedGram
    }
}