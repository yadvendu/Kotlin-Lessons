package Collection

fun main(args:Array<String>){
    var mutableSetA = mutableSetOf(1,5,6,8,3)
    println("--Mutable set--")
    println(mutableSetA)


    println("Adding and removing elements in mutable set")
    mutableSetA.add(10)
    println("After adding element 10 in mutable set")
    println(mutableSetA)
    mutableSetA.add(6)
    println("After adding duplicate element 6 in set")
    println(mutableSetA)

    //mutableSetA[2] = 2(Set method deos not provide array aceess bcz it is unordered collection of elements)
    mutableSetA.remove(8)
    println("After removing element 8 from the set")
    println(mutableSetA)
    println("Traversal through set")
    mutableSetA.forEach { element -> println(element) }

    println()
    println("Dropping of elements using drop() method")
    var newMutableSet = mutableSetA.drop(2)
    println("After droppinf first 2 elements for first set and assigning to new set")
    println(newMutableSet)
}