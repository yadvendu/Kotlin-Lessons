package ScopeFunction

/*
Points to remember:-
1.apply is just like also,only diffrence here instead of it , this is used
2.If the property name of the data class is unique in the function, you can omit this.
 */
fun main(args:Array<String>){
    var person = Tutorial("Yadu","Kotlin")
    person.apply { this.language = "Swift" }
    println(person)

    println("--Diffrence between also and apply--")
    //apply uses this and also uses it,in apply we can omit this if the parameter  name is unique
    person.apply { name = "Yadu" }
    println(person)
    person.also { it.name = "Yadu" }
    println(person)

}

data class Tutorial(var name:String,var language:String)