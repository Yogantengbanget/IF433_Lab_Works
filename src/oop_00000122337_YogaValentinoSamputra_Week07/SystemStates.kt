package oop_00000122337_YogaValentinoSamputra_Week07

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiRespone{
    data class Success(val data : String ) : ApiRespone()
    data class Error(val messeage : String) : ApiRespone()
    object Loading : ApiRespone()
}