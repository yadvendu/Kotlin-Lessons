package Collection

fun main(args:Array<String>){
    /*
    example of immutable list containing integers
     */
    println("--Immutable list of Integers--")
    val a = listOf(1,2,3,10)
    println("Size of list")
    println(a.size)
    println("Position of integer 10 in list")
    println(a.indexOf(10))
    println("Element at position 2 in list")
    println(a[2])

    println()
    println("--Immutable list of Strings--")
    val name = listOf("Ram","Mohan","Chandan","Guru")
    println("Names of person in the list")
    for (i in name.indices){
        println(name[i])
    }

    println()
    println("--Indexing of elements of list in kotlin--")
    val numbers = listOf(1, 5, 7, 32, 0, 21, 1, 6, 10)
    println("Number at index 0 is: ${numbers.get(0)}")//one way of indexing
    println("Number at index 7 is: ${numbers[7]}")//another way of indexing
    println("The first index of number 1 is: ${numbers.indexOf(1)}")
    println("The last index of number 1 is: ${numbers.lastIndexOf(1)}")
    println("The last index of list is: ${numbers.lastIndex}")
    println("The first element of the list is: ${numbers.first()}")
    println("The last element of the list is: ${numbers.last()}")

    println()
    println("--List iterator methods--")
    val nameList = listOf("Gopal", "Asad", "Shubham", "Aditya",
        "Devarsh", "Nikhil", "Gagan")

    //method 1
    for (element in nameList){
        println(element)
    }

    //method 2
    println()
    for (element in 0 until nameList.size ){
        println(nameList[element])
    }

    //method 3
    println()
    nameList.forEachIndexed({i,j -> println("name[$i] = $j")})

    println()
    println("--Sorting the list--")
    val newNumbers = listOf(8, 4, 7, 1, 2, 3, 0, 5, 6)
    println("Numbers in asc. order: ${newNumbers.sorted()}")
    println("Numbers in desc. order: ${newNumbers.sortedDescending()}")

    println()
    println("--Contains and contains all operation--")
    val listNumbers = listOf(8, 4, 7, 1, 2, 3, 0, 5, 6 )
    val result = listNumbers.contains(7)
    if (result)
        println("Yes list contains number 7 at index: ${listNumbers.indexOf(7)}")
    else
        println("No list does not contains number 7")

    val newresult = listNumbers.containsAll(listOf(8,4,-1))
    if (newresult)
        println("Yes list contains all numbers")
    else
        println("No list does not contains all numbers")

}