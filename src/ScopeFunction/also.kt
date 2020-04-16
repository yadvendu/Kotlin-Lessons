package ScopeFunction

/*
Points to remember:-
1.like let , also expressions does some additional processing on the object it was invoked
2.Unlike let, it returns the original object instead of any new return data
3.Unlike let and run,it can access the outside value inside the scope but the change does not prevails outside the scope
4.Also always return its object type
 */
fun main(args:Array<String>){
    var m = 1
    m = m.also { m = 3 }
    println(m)

    var obj =Match("Football",11)
    println("Showing that also function always return the object type on which its invoked")
    obj.also { it.game = "Cricket"
    "Hello"}//Here it says "Hello" is unused bcz irrespective of what last statement is it always returns the object type only
    println(obj)

    println()
    println("Diffrence between let and also")
    val objRun = obj.let { it.game = "Basketball" }
    val objAlso = obj.also { it.game = "Hockey" }
    println("let returns: $objRun")
    println("also returns: $objAlso")

    println()
    println("New example for also")
    var newString = "Hello World"
    var length = newString.also { it.length }//However returning length of String which is of type int but as "also"
                                             //always return object type so when we print lenth it prints "Hello"
    println(length)

}

data class Match(var game:String,var numberofPlayers:Int)