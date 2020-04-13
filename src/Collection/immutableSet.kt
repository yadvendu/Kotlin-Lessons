package Collection

fun main(args:Array<String>){
    println("--Working with sets--")
    val seta = setOf("India","America","Australia","America")
    val setb = setOf(1,2,3,4,4)

    println("Set containing names of countries")
    seta.forEach { element -> println(element) }

    println()
    println("Set of integers")
    setb.forEach { elemet -> println(elemet) }

    println()
    val captains = setOf("Kohli","Smith","Root","Malinga","Rohit","Dhawan","Rohit")
    println("The captain at index 2 is: ${captains.elementAt(2)}")
    println("The index of Smith is: ${captains.indexOf("Smith")}")
    println("The last index of Rohit is: ${captains.lastIndexOf("Rohit")}")
    println("The first captain is: ${captains.first()}")
    println("The first captain is: ${captains.last()}")

    println()
    val numers = setOf(20,10,30,50,60,10)
    println("The number of elements in the set is: ${numers.count()}")
    println("The max element in the set is: ${numers.max()}")
    println("The min element in the set is: ${numers.min()}")
    println("The sum of the element in set is: ${numers.sum()}")
    println("The avg of the element in set is: ${numers.average()}")
    println("Does set contains number 20?: ${numers.contains(20)}")
    println("Does set contains number of the elemets 10,30,80?: ${numers.containsAll(listOf(10,30,80))}")

    println()
    println("Equality checking and isEmpty in sets")
    val firstSet = setOf<Int>()
    val secondSet = setOf<String>()
    println("Is firstset Empty?: ${firstSet.isEmpty()}")
    println("Is secondset Empty?: ${secondSet.isEmpty()}")
    println("Are both the sets equal:${firstSet.equals(secondSet)}")
}