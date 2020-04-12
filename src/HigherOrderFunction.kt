fun higherOrderFunction(){
    lambda()
}

fun sumUsingHigherOrderFunction(sum : (Int,Int)->Int){
    var total = sum(10,20)
    println("Sum using lambda function $total")
}

fun needsRation(salary:Int):Boolean{
    if (salary < 10000){
        return true
    }
    return false
}

fun giveRation(name:String,quantity:String , x:(Int)->Boolean){
    var result = x(5000)
    if (result){
        println("Give $name ration of $quantity kg")
    }else{
        println("$name is sbove the criteria level")
    }
}

var lambda = { println("Passing lambda as a parameter to higher order finction")}
var sumLambda = {x:Int,y:Int -> x+y}

//Higher order function returning a function

fun multiply(x:Int,y:Int){
    println("product of two numbers is ${x*y}")
}

fun returnFunction():(Int,Int)->Unit{
    return ::multiply
}

fun main(args:Array<String>){
    higherOrderFunction()
    sumUsingHigherOrderFunction(sumLambda)
    giveRation("Sambhu","5 kg",::needsRation)
    var calculate = returnFunction()
    calculate(5,10)
}