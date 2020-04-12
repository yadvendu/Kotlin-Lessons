class Outer{
    var a = "Outside inner class"
    fun callFromInner():String{
        return "Outer class function call from inner class"
    }
   inner class Nested(var msg:String){
        var b = msg
        var c = callFromInner()
        fun nest(){
            println("Function called from nested class")
        }
    }
}

fun main(args:Array<String>){
    var obj = Outer()
    var obj1 = Outer().Nested("Inside nested class")
    println(obj.a)
    println(obj1.b)
    obj1.nest()
    println(obj1.c)

}