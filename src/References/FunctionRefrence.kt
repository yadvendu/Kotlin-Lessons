package References

fun add(a:Int,b:Int):Int{
    return a+b
}

fun showResult(x:(Int,Int)->Int){
   val value = x(10,20)
   println(value)
}

fun divide(a:Int):Boolean{
    return a%3 == 0
}

fun main(args:Array<String>){
    showResult(::add)
    val array = arrayOf(10,20,30,40,50,60,90)
    println(array.filter(::divide))
}