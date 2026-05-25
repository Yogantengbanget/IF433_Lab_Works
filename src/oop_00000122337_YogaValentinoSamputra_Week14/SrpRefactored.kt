package oop_00000122337_YogaValentinoSamputra_Week14

data class User(
    val name: String,
    val email: String,
    val age: Int
)

class UserValidator {

    fun validate(user: User): Boolean =
        user.email.contains("@") && user.age >= 18
}

class UserRepository {

    fun save(user: User) {
        println("Saving user: ${user.name} to Database")
    }
}