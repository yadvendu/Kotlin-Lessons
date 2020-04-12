package Collection

/*
Array List
 */
fun main(args:Array<String>){
    var arrList = arrayListOf<String>()
    println("Is arrList empty?: ${arrList.isEmpty()}")

    println()
    val langList = arrayListOf<String>("Java", "Python", "JavaScript")
    println("Is list empty?: ${langList.isEmpty()}")
    println(langList)

    /*
    Making an array List of any data types
     */
    println()
    println("--List with any type--")
    var anylist = arrayListOf<Any>("Hello",1,'a',10.0f)
    anylist.forEach { element -> println(element) }
    println("Size of any list is: ${anylist.size}")

    /*
    Adding elements into array list
     */
    var list = arrayListOf<String>("Hello","World")
    list.add("Good Morning")
    println("List after adding element: ${list}")
    list.add(0,"Welcome")
    println("List after adding element at specific position: ${list}")
    list.addAll(listOf("to","New","Delhi"))
    println("List after more than one element at same time: ${list}")
    list.addAll(1, listOf("At","postion","1"))
    println("Adding more than one element at specific position: ${list}")
//    list.clear()
//    println("List after clearing all elements: ${list}")
    println()
    println("Does is contain word Hello?: ${list.contains("Hello")}")
    println("Does it contains words Hello World:? ${list.containsAll(listOf("Hello","World"))}")
    println()
    println("Element at index 1 is: ${list.get(1)}")
    println("Index of world Hello is: ${list.indexOf("Hello")}")
    println()
    list.remove("Good Morning")
    println("list after removing Good Morning: ${list}")
    list.removeAll(listOf("Hello","World"))
    println("list after removing multiple elements: ${list}")
    list.removeAt(0)
    println("list after removing at position 0 is: ${list}")

    println()
    var arrayFromList = list.toArray()
    println("Array from array List")
    arrayFromList.forEach { element -> print(" ${element}")}
    var stringRep = list.toString()
    println()
    println("String representation of array list: ${stringRep}")
}
