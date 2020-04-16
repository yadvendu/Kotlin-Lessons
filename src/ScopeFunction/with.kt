package ScopeFunction

/*
Points to remember:-
1.Like apply, with is used to change instance properties without the need to call dot operator over the reference every time
2.with runs without an object whereas apply needs one.
3.apply runs on the object reference, whereas with just passes it as an argument.
4.The last expression of with function returns a result.
5.With does not support it rather this is used which is optional if parameter name is unique
 */

fun main(args:Array<String>){
    var withObj = NewMatch("Cricket",11)
    with(withObj){
        game = "Football"
        numberofPlayers = 11
    }
    println(withObj)

    println()
    println("Unlike apply with can return any type as shown:")
    var name = with(withObj){
        game = "Football"
        numberofPlayers = 11
        "Returns a string even working on object of type New Match"
    }

    println(name)
}

data class NewMatch(var game:String,var numberofPlayers:Int)