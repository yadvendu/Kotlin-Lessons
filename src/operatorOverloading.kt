fun main(args:Array<String>){
    val firstNumber = Sum(10,20)
    val secondNumber = Sum(20,30)
    var result = firstNumber + secondNumber
    println("the sum is:${result.x},${result.y}")

    --result
    println("After decrement x is ${result.x} and y is ${result.y}")
}


class Sum(var x:Int,var y:Int){
    //overloading plus operator
    operator fun plus(s:Sum):Sum{
        return Sum(x+s.x,y+s.y)
    }

    //overloading -- operator
    operator fun dec() = Sum(--x,--y)
}