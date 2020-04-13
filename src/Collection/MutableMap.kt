package Collection

fun main(args:Array<String>){
    println("Working with mutable map")
    println("Adding and removing elements in map")
    var mutablemapOfNames = mutableMapOf<Int,String>(1 to "Akash",5 to "Ramesh",6 to "Prateek",10 to "Abdul")

    println("Before adding elements to map")
    println(mutablemapOfNames)
    mutablemapOfNames.put(7,"Dhoni")
    println("After adding one key value pair")
    println(mutablemapOfNames)

    val map = mapOf<Int,String>(11 to "Bale",17 to "De Bruyne")
    mutablemapOfNames.putAll(map)
    println("After adding more than one key value pair in map")
    println(mutablemapOfNames)

    println("Removing eleemts from map")
    mutablemapOfNames.remove(11,"Bale")
    println("After removing key value pair of Bale assigned to key 11")
    println(mutablemapOfNames)

    println()
    println("Traversal in map")
    println("Final key value pair")
    mutablemapOfNames.forEach { keyvalue  -> println(keyvalue) }

    println()
    println("Another way of traversal")
    for (element in mutablemapOfNames){
        println(element)
    }

    println()
    println("Another way of traversal")
    mutablemapOfNames.forEach { key, value -> println("$key: $value") }

    println()
    println("Another way of traversal")
    for (keys in mutablemapOfNames.keys){
        println("$keys: ${mutablemapOfNames[keys]}")
    }

    println()
    println("Another way of traversal")
    for (values in mutablemapOfNames.values){
        println(values)
    }

    println()
    println("Removing all the elements from map")
    mutablemapOfNames.clear()
    println(mutablemapOfNames)
}