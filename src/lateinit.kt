fun main(args:Array<String>){
    val obj = Name()
    obj.name = "Yadu"
    obj.printName()
}

class Name{
    lateinit var name:String
    fun printName(){
        println("My name is ${name}")
    }
}