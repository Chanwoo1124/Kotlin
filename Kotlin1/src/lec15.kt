fun main(){
//    val array = arrayOf(100,200)
//
//    for (i in array.indices){
//        println("${i} , ${array[i]}")
//    }
//
//    for ((idx, value) in array.withIndex()) {
//        println("$idx $value")
//    }
//
//    array.plus(300)

    val numbers = mutableListOf(100,200)

    numbers.add(300)

    for (number in numbers){
        println(number)
    }

    for ((idx,value) in numbers.withIndex()){
        println(" $idx $value")
    }

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "안녕"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "monday", 2 to "Tuesday" )

    for (key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for ((key,value) in oldMap.entries){
        println("$key $value")
    }
}
