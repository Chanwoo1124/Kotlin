
fun main() {
    val person = PersonK("cksdn", 20)
    person.age= 1
    println(person.name + person.age)
    val idAdult = person.idAdult


}

class PersonK (
    name : String,
    var age: Int
) {
    var name = name
        set(value) {
            field = value.uppercase()
        }



    init {
        if (age <= 0){
            throw IllegalArgumentException("나이는 ${age} 일수 없습니다.")
        }
    }

    constructor(name: String) : this(name, 1)
//
//    fun isAdult() : Boolean {
//        return this.age >= 20
//    }

    val idAdult : Boolean
        get() {
            return this.age >= 20
        }

}