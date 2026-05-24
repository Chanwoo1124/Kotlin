class lec05 {
}


fun  validateScoreIsNotNegative(score : Int) : String{
    return if (score >= 50){
        "P"
    }
    else{
        "F"
    }
}

fun getGrade(score:Int) : String{
    return if (score > 90){
        "A"
    }
    else if (score >= 80){
        "B"
    }else{
        "C"
    }
}

fun hani(score : Int) : String{
    return if (score in 0..100){
        "스코어가 0 ~ 100 범위에 있습니다."
    }
    else{
        "아님"
    }
}

fun getGradeWithSwitch(score :Int): String{
    return when (score / 10){
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else ->  "D"

    }
}

fun startWithA(obj : Any): Boolean{
    return if (obj is String){
        obj.startsWith("A")
    }
    else{
        false
    }
}

fun startWitchA(obj : Any) : Boolean {
    return when (obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number : Int){
    when (number){
        -1,0,+1 -> println("어디서 많이 본 숫자입니다")
        else -> println("아니다")
    }
}

fun judgeNumber2(number : Int){
    when {
        number == 0 -> println("0임")
        number / 2 == 0 -> println("짝임")
        else -> println("홀")
    }

}