package oop_00000122337_YogaValentinoSamputra_week10

class WalletRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll() : List<T>{
        return items
    }
}

data class ApiResponse<T>(
    val status: String,
    val data: T
)