fun main(args:Array<String>){
    displayGreetings("Welcome to my home","Ajay")
    displayGreetings("Welcome to my restaurant")
    threeNumberSum(5,5,5)
    threeNumberSum(b=30,c=10)
    threeNumberSum(30,b=20)
    threeNumberSum(3,b=10)//named argument should alwz be placed before postion argument to use position and named argument together
    sum(1,2,3,4,5)
    sum(1,2,3,4,5,message = "The sum of vararg arguments is")

    var numberArray = intArrayOf(1,2,3,4,5,6)
    sum(*numberArray,message = "The sum of array numbers is")//* is called spread operator

    localFunction("Yadu","24","Madhepura")

    var obj = InfixExample()
    obj showName "List of Names :"
}

//function default arguments
fun displayGreetings(message:String,name:String = "Prateek"){
    println("Hello $name, $message")
}

//Named arguments
fun threeNumberSum(a:Int = 10,b:Int,c:Int = 20){
    println("The sum of three number is ${a+b+c}")
}

//Varargs argument
fun sum(vararg number:Int){
    var totlaSum = 0
    for (item in number){
        totlaSum = totlaSum + item
    }
    println("$totlaSum")
}

fun sum(vararg number:Int,message: String){
    var totlaSum = 0
    for (item in number){
        totlaSum = totlaSum + item
    }
    println("$message: $totlaSum")
}

//Local function
fun localFunction(name:String,age:String,town:String){
    println("Hello $name")
    fun insideFunction(){
        println("Your age is $age and your birthplace is $town")
    }
    insideFunction()
}

//Infix function
class InfixExample(){
    var list = arrayOf("Yadu","Prateek","Ajay","john")
}

infix fun InfixExample.showName(message: String){
    println(message)
    for (item in list){
        println(item)
    }
}
