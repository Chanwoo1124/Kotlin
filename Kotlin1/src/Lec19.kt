
fun main(){
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let { lengths -> println(lengths) }
}