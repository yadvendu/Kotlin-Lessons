/*Syntax of Lambda function :-
val lambda_name : Data_type = { argument_List -> code_body }*/

fun main(args:Array<String>){
    val company = { println("Lakme Salon")}
    company()
    println(lambdasum(10,20))
    val result = lambdasum1(5,5)
    println(result)
    var result1 = lambdasum2(10,50)
    println(result1)
    var name = lambdaName("Yadu")
    println(name)
    println(lambdaIt(5))
}

val lambdasum = {a:Int,b:Int -> a+b}
val lambdasum1:(Int,Int)->Int = {a,b -> a+b}
var lambdasum2 = {a:Int,b:Int ->
    val number = a+b
    number.toString()
}

val lambdaName:(String)->String = {it}
val lambdaIt:(Int)->Boolean ={if (it > 0) true else false}