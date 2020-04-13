package Collection

fun main(args:Array<String>){
    println("--Working with map--")
    val map = mapOf(1 to "Paris",2 to "Italy",3 to "Las Vegas",3 to "Singapore")
    //Here if a same key has two value it prints the last pair
    println(map)
    println("Map Keys: ${map.keys}")
    println("Map values: ${map.values}")

    println()
    println("Caluclating size")
    println("Size of map using size property: ${map.size}")
    println("Size of map using count method: ${map.count()}")

    println()
    println("Creating empty map")
    val emptyMap = mapOf<String,Int>()
    println(emptyMap)

    println("Getting values of map")
    val ranks = mapOf(1 to "India",2 to "Australia",3 to "England",4 to "Africa")
    println("Team having rank 1 is: ${ranks[1]}")
    println("Team having rank 3 is: ${ranks.getValue(3)}")
    println("Team having rank 4 is: ${ranks.getOrDefault(4,0)}")
    val defaultValue = ranks.getOrElse(2,{0})//See more into it
    println("Team having rank 2 is: ${defaultValue}")

    println("Using  contains in map")
    println("Does map contain key 8: ${ranks.containsKey(8)}")
    println("Does map contain value Australia: ${ranks.containsValue("Australia")}")
    //No containsAll in map available


}