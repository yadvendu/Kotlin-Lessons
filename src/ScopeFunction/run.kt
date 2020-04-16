package ScopeFunction

/*
Points to remember:-
1.Similar to the let function, the run function also returns the last statement
2.Unlike let, the run function doesn’t support the it keyword
3.run is useful when your lambda contains both the object initialization and the computation of the return value.
4.Kotlin run expression can change the outer property
5.It can access the outside variable and and change its value from inside scope that prevails even outside the scope
6.Unlike let, run can operate without dot operator reference on object
 */

fun main(args:Array<String>){
    var string ="Hello World"
    println(string)
    string = run {
        string = "Hello World changed inside run function"
        string
    }
    println(string)

    val value = run {
        val x = 5
        val y = 10
        calculate(x,y)
    }
    println(value)

    var name = run {
        Name("Yadu")
    }
    println(name.name)

    println()
    println("Using let and run together")
    var p:String? = null
    p?.let { println("Name : $p") }?:run{ println("p is null.Setting default value to:")
    p = "Prateek"}
    println(p)

    val run = RunExampleTestClass().run {
        this.name = "New Yadu"
        this.number = "987654321"
        this.city = "Patna"
        ScopeExampleTestClass()
    }
    println(run.city)

}

data class Name (var name:String)


class RunExampleTestClass(){
    var name:String = "Prateek"
    var number = "98779899"
    var city = "Bangalore"


}

fun calculate(x:Int,y:Int):Int{
    return x+y
}
