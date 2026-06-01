import com.sun.jdi.Value

fun main() {
    val dto1 = PersonDto("최태현", 100)
}



data class PersonDto(
    private val name : String,
    private val age : Int
)


enum class Country(
    private val code : String
){

    KOREA("KO"),
    AMERICA("US")
}

fun handleCountry(country: Country){
    when (country){
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}