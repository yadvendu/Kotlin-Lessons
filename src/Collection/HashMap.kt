package Collection

fun main(args:Array<String>){
    println("Working with hash map")
    var hashMap = HashMap<Int,String>()
    println("Empty hash map")
    println(hashMap)

    hashMap.put(1,"Kohli")
    hashMap.put(2,"Rohit")
    hashMap.put(3,"Dhawan")
    hashMap.put(4,"Pandey")
    hashMap.put(5,"Dhoni")
    hashMap.put(6,"Raina")

    println()
    println(hashMap)

    println()
    println("Traversal through hash map")
    hashMap.forEach { key, value -> println("$key: $value")  }

    println("Using hash map initial capacity")
    var hashMapWithCapacity = HashMap<Int,String>(4)

    hashMapWithCapacity.put(1,"Kohli")
    hashMapWithCapacity.put(2,"Rohit")
    hashMapWithCapacity.put(3,"Dhawan")
    hashMapWithCapacity.put(4,"Pandey")

    hashMapWithCapacity[2] = "New Rohit"//way of changing the value for a key

    println("The size of hash map is: ${hashMapWithCapacity.size}")

    println()
    hashMapWithCapacity[5] = "Gambhir"
    println(hashMapWithCapacity)
    println("The size of hash map with added element is: ${hashMapWithCapacity.size}")

    println()
    println("Use of get and remove in hash map")
    println("Value for key 2 is: ${hashMapWithCapacity.get(2)}")
    println("Change value for key 4 is: ${hashMapWithCapacity.replace(4,"Hardik Pandey")}")
    println(hashMapWithCapacity)
}