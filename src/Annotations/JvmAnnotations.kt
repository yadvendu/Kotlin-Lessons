package Annotations

class JvmName(){
    companion object{
        @JvmStatic fun value(){
            println("Act as static function in Java")
        }

        fun anotherValue(){
            println("Can only be access from java file using Companion object")
        }
    }

}

object JvmNameObject{
    @JvmStatic fun name(){
        println("My name is Yadu and its called in java file as its static declared")
    }

    fun age(){
        println("My age is 24 and can not be called in java file without instance of object as its not static")
    }
}

data class Game @JvmOverloads constructor(val game:String,@JvmField val noOfPlayers:Int = 11)
