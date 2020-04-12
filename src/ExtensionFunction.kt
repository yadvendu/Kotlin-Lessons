class First(){
    fun name(){
        println("Inside class First")
    }
}

open class X(val a:Int,val b:Int){
}

class Y(a: Int,b: Int):X(a, b){

}

fun main(args:Array<String>){
    fun First.extensionFunction(){
        println("Inside extension fucntion")
    }
    var obj = First()
    obj.name()
    obj.extensionFunction()

    fun Int.abs():Int{
        return if(this < 0){
            +this
        }else{
            -this
        }
    }

    println(-4.abs())

    fun X.operate():Int{
        return a+b
    }
    fun Y.operate():Int{
        return a*b
    }

    var yobj = Y(5,5)
    fun display(a:X){
        println(a.operate())
    }

    display(yobj)
}