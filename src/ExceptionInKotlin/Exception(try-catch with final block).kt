package ExceptionInKotlin

fun main(args:Array<String>){
    println("--Let's work with final block--")
    try {
        val number = 10/0
        println(number)
    }catch (e:ArithmeticException){
       println(e)
    }finally {
        println("The block always executes")
    }

    println()
    println("--Example of throw--")
    testLength("Hello")
}

fun testLength(str:String){
    try {
        if(str.length < 6){
            throw ArithmeticException("Length of string is short")
        }else{
            println(str)
        }
    }catch (e:ArithmeticException){
        println(e)
    }
}