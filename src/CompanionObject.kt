
fun main(args:Array<String>){
    Singelton.getInstance.printName("Yadu")

    var obj =Test()
    obj.printa()
}

class Singelton{
    private constructor(){

    }
    companion object {
        //private lateinit var instance:Singelton
        private var instance:Singelton ?= null
        val getInstance:Singelton
            get() {
                if(instance == null){
                    instance = Singelton()
                }
                return instance!!
            }
    }

    fun printName(name:String){
        println("My name is $name")
    }
}

class Test(){
    fun printa(){
        println(a)
    }
    companion object{
        var a:
                Int = 10
    }
}
