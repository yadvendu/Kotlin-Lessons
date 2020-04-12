package Collection

fun main(args:Array<String>){
    /*
    using libarary function for array
     */
    var arrayOfNumbers = arrayOf(5,6,1,20)
    println("Iterating through array through first method")
    arrayOfNumbers.forEach { numbers -> println(numbers) }//one way of iterating

    println()
    println("Iterating through array using for loop")
    for (elements in arrayOfNumbers){
        println(elements)
    }

    println()
    println("Accesing array elements and changing its value")
    arrayOfNumbers[0] = 100
    val newNumber = arrayOfNumbers[0]
    println(newNumber)

    /*
    using Array class constructor
     */
    println()
    println("Table of 5")
    var multipleOfFive = Array(10,{i -> 5 * (i+1) })
    for (elements in multipleOfFive){
        println(elements)
    }
    /*
    Built in factory methods to create primitive type arrays like intArrayOf(),byteArrayOf(),charArrayOf(),shortArrayOf(),longArrayOf()
     */
    println()
    println("Using built in primitive type array")
    var arrayOfChar = charArrayOf('a','b','c','d','e')
    for (elements in arrayOfChar){
        println(elements)
    }

    /*
    Use of get and set in array to acces and set elements
     */
    println()
    println("Use of get and set Method")
    println(arrayOfChar.get(2))
    arrayOfChar.set(0,'y')
    println(arrayOfChar.get(0))

    /*
    Traversing array in diffrent ways
     */
    println()
    println("Traversing array in different way")
    println("Using indices")
    for (element in arrayOfChar.indices){
        print("$element:${arrayOfChar[element]} ")
        println()
    }
    println()
    println("Using range")
    for (i in 0..arrayOfChar.size-1){
        println(arrayOfChar[i])
    }

    println()
    println("Using foreach loop")
    arrayOfChar.forEach { element -> println(element) }

}