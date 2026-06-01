fun main(){


}


fun moveSomething (){

}

class Person1 private constructor(
    private var name : String,
    private var age : Int
){
    //static 대신 companion object가 사용됨
    companion object Factory : log {
        const val MIN_AGE = 1

        //@JvmStatic 붙이면 자바에서 바로 접근이 가능함
        @JvmStatic
        fun newBaby(name : String) : Person1{
            return Person1(name, MIN_AGE)
        }

        override fun log() {
            println("안녕")

        }
    }

}

object Singleton{
    var a : Int = 0
}