data class Fruit(
    val id : Long,
    val name : String,
    val factoryPrice : Long,
    val currentPrice : Long
)

val fruits = listOf<Fruit>(
    Fruit(1L,"사과", 3L, 5L),
    Fruit(2L,"사과", 3L, 5L),
    Fruit(1L,"바나나", 3L, 5L),
    Fruit(1L,"바나나", 3L, 5L),
    Fruit(1L,"수박", 3L, 5L),
    Fruit(1L,"수박", 3L, 5L),
)

val apples = fruits.filter { fruit -> fruit.name == "사과" }

fun main(){
    println(apples)
}
