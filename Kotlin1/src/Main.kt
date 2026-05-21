//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val money = JavaMoney(1019L)
    val money2 = JavaMoney(110L)

    if (money > money2){
        println("더 큽니다 ${money}")
    }


}

fun printAgeIfPerson(obj : Any?){
    val person = obj as? Person
    println(person?.name)
}

