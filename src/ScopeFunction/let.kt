package ScopeFunction

/*
Points to remember:-
1.let takes the object it is invoked upon as the parameter and returns the result of the lambda expression.
2.Kotlin let is a scoping function wherein the variables declared inside the expression cannot be used outside.
3.The last value from the let is returned as an argument
4.For nested let, we can’t use it keyword. We need to assign explicit names to it in both the let functions.
5.Only the outermost let returns the value
6.The code inside the let expression is executed only when the property is not null
5.can be used to change the instance property and to make a new instance from existing instance with some changed values
6.let expressions does some additional processing on the object it was invoked
7.It can access the outside variable and and change its value from inside scope that prevails even outside the scope
 */

fun main(args:Array<String>){
    println("--Working with let--")
    val str = "Hello World"
    var jnn = 0
    str.let {
        println(it)
    }
    println("String: $str")
    val strlength = str.let { it.length }
    println("The length of string is: $strlength")

    println()
    println("--Chaining let function--")
    var a= 1
    var b =2
    a = a.let { it+2 }.let { val i = it + b
    i}
    println("Value of a after using let function: $a")

    println()
    println("--Nesting let function--")
    var name = "Yadu"
    name.let { outer -> outer.let { inner -> println("Inner is $inner and outer is $outer") } }
    println()
    name.let { outer ->
        outer.let { inner ->
            println("Inside Inner")
        }
        "Inside outer"
    }
    println(name)

    println()
    println("Using let for null checks")
    var city:String? = "Bangalore"
    city?.let { println("Welocme to $it") }
    city = null
    city?.let { println("Welcome Again") }

    println()
    println("--Understanding let--")
    println("Without using let")
    Person.name ="Yadu"
    Person.showAge(24)

    println()
    println("Using let")
    Person.let {
        it.name = "Yadu"
        it.showAge(25)
    }

    println()
    var obj = Address("Bangalore","Karnataka","India")
//    obj.city = "Patna"
//    obj.state = "Bihar"
//    println(obj)
    var newAddress = obj.let {
        it.city = "Patna"
        it.state = "Bihar"
        it
    }
    println(obj)
    println(newAddress)

    var xyz:Address? = obj
    xyz = null
    xyz?.let {
        println(it)
    }?: println("xyz address is null")

    println()
    println("--Understanding let in better way--")
    val scope = ScopeExampleTestClass().let {
        "The name of the person is: ${it.name}"
    }
    println(scope)

    println("Calling let without return")
    val scope1 = ScopeExampleTestClass().let {
        it.name = "Yadu"
    }
    println(scope1)

    println()
    println("--Using run in same way--")
    val run = ScopeExampleTestClass().run {
        this.name = "New Yadu"
        this.number = "987654321"
        this.city = "Patna"
        ScopeExampleTestClass()
    }
    println(run.city)

    var out = 10
    out.let { out = 0 }
    println(out)
}

object Person{
    var name:String? = null
    fun showAge(age:Int){
        println("Age of  $name is $age")
    }
}

data class Address(var city:String,var state:String,var country:String)

class ScopeExampleTestClass(){
    var name:String = "Prateek"
    var number = "98779899"
    var city = "Bangalore"


}