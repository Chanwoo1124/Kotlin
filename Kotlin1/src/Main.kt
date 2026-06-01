//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    val money = JavaMoney(1019L)
    val money2 = JavaMoney(110L)

    if (money > money2){
        println("더 큽니qwe다 ${money}")
    }

    var a = 1
    val b = 2


    val chan : String = "찬우"

    val ch = chan[1]
    println(ch)

    val chanwoo = """
        이찬우
        이찬우
        이찬우
        
    """.trimIndent()

    println(chanwoo)



}

fun printAgeIfPerson(obj : Any?){
    val person = obj as? Person
    println(person?.name)
}

fun cal(a : String? , b : String?) : String {
    println(a?.length?: return "하이")

    return "성공"
}



