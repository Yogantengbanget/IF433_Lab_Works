package oop_00000122337_YogaValentinoSamputra_Week07

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse{
    data class Success(val data : String ) : ApiResponse()
    data class Error(val messeage : String) : ApiResponse()
    object Loading : ApiResponse()
}