package ExceptionInKotlin

/*
There are two types of exception :-
1.Checked Exception :- Exceptions that are typically set on methods and checked at the compile time, for example IOException, FileNotFoundException etc
2.Unchecked Exception :- Exceptions that are generally due to logical errors and checked at the run time, for example NullPointerException, ArrayIndexOutOfBoundException etc
 */
/*
Note:-
In Kotlin, we have only unchecked exceptions and can be caught only at run time.
 */

fun main(){
    println("--Working with Exception--")
//    val number = 10/0
//    println(number)
    //The above will throw an exception as we are trying to divide a number by zero.The exception will be of type Arithmetic Exception
    println()
    /*
    try catch block
     */
    println("Let's handle the exception with try and catch block")
    try {
        val number = 10/0
        println(number)
    }catch (e : ArithmeticException){
        println("Divide by zero not allowed")
    }
    println()
    /*
    try catch block as expression
    1.It returns the last expression of try or catch block
     */
    println("--Try catch block as expression in Kotlin--")
    println("First Case")
    println(calculate(20,10))
    println()
    println("Second Case")
    println(calculate(20,0))
}

fun calculate(a:Int,b:Int):Any{
    return try {
        a/b
    }catch (e:Exception){
         println(e)
        "Divided by zero not allowed"
    }
    println()
}