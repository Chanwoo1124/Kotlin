fun main() {
    repeat("찬", 1, true)
    repeat("안녕" )
    repeat("우영", useNewLine = false)

    var person = Person("안녕")
    println(person.name)
    printAll("a","b","c")
    val array = arrayOf("a","b","c")
    printAll(*array)

    person = Person("안녕")

    println(person.name)

}


// 하나의 결과값이면 {} 안쓰고 = 을 사용할 수 있음.
fun max (a : Int , b : Int) =  if (a > b ) a  else  b



fun repeat(
    str : String,
    num: Int = 3,
    useNewLine: Boolean = true){
    for (i in 1..num){
        if (useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}

fun printAll(vararg strings : String){
    for (str in strings){
        println(str)
    }
}