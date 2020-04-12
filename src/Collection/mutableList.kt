package Collection

fun main(args:Array<String>){
    println("Mutable list of integer")
    var integerList = mutableListOf<Int>(1 , 2 , 3 , 4 , 3)
    println(integerList)

    println()
    println("Mutable list of Strings")
    var stringList = mutableListOf<String>("Hello","World")
    println(stringList)

    println()
    println("Empty mutable list")
    var emptyList = mutableListOf<Int>()
    println(emptyList)

    /*
    Adding and removing elements from mutable list
     */
    println()
    println("--Adding or removing elements from mutable list--")
    var listOfNames = mutableListOf<String>("Gopal", "Asad", "Shubham", "Aditya",
        "Devarsh", "Nikhil", "Gagan")
    listOfNames.add(3,"Yadu")
    println()
    println("List of names after adding Yadu at index 3")
    listOfNames.forEach { element -> println(element) }

    listOfNames.remove("Gagan")
    println("")
    println("List Of Names after removing Gagan")
    listOfNames.forEach { element -> println(element) }

    /*
    Set indexing and contains
     */
    println()
    println("--Use of set Indexing--")
    val captains = mutableListOf<String>("Kohli","Smith","Root","Rohit","Dhawan")
    println("The captain at index 2 is: ${captains.elementAt(2)}")
    println()
    println("Index of Kohli is: ${captains.indexOf("Kohli")}")
    println()
    println("Last Index of Rohit is: ${captains.lastIndexOf("Rohit")}")
    println()
    println("First captain in captains list: ${captains.first()}")
    println()
    println("Last captain in captains list: ${captains.last()}")

    println()
    val contains = captains.contains("Sachin")
    if (contains)
        println("Yes sachin is in captain list")
    else
        println("No sachin is not in captain list")

    println()
    val containsall = captains.containsAll(listOf("Kohli","Smith"))
    if (containsall)
        println("Yes both are presenyt in captain list")
    else
        println("Not present in captain list")


}
