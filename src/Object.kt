interface Info{
    fun printSum()
}

interface getAge{
    fun age()
}
object Add:Info{
    var sum = 0
    fun add(a:Int,b:Int){
        sum = a+b
    }

    override fun printSum() {
        println("The sum of two numbers is $sum")
    }
}

open class ChangeSumValue(){
    fun value(){
        Add.sum = 50
    }

    open fun createAnynomousObject(){
        println("hello World")
    }
}

fun main(args:Array<String>){
    Add.add(10,10)
    ChangeSumValue().value()
    Add.printSum()

    //object expression extending class
    var obj = object : ChangeSumValue(){
        override fun createAnynomousObject() {
            super.createAnynomousObject()
            println("Updated Hello world")
        }

    }

    //simple object expression
    var objnew = object {
        fun value():Int{
            return 100
        }
    }

    println(obj.createAnynomousObject())
    println(objnew.value())

    //object expression extending interface
     var age =object : getAge{
        override fun age() {
            println("My age is 25")
        }

    }

    println(age.age())
}