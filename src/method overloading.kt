fun main(args:Array<String>){
    val integerAddition = add(5,5)
    val floatAddition = add(4.5f,4.5f)
    val doubleAddition = add(9.8,9.8)
    println(integerAddition)
    println(floatAddition)
    println(doubleAddition)
}

fun add(a:Int,b:Int):Int{
    return a+b
}

fun add(a:Float,b:Float):Float = a+b

fun add(a:Double,b:Double) = a+b