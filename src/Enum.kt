enum class Months(name:String){
    January("Jan"),
    February("feb"),
    March("mar")
}

enum class Car(var shorthand:String){
    Honda("Hon"),
    Suzuki("Suz"),
    Hyundai("Huy");
}

fun main(args:Array<String>){
    for (enums in Months.values()){
     //   println(enums.name)
    }

//    println(Months.January)
    println(Months.values().size)
//    println(Months.valueOf("March"))
//    println(Months.January.ordinal)

    var x = Car.Honda
   // println(x.shorthand)
    x.shorthand = "Changed to Hyu"
   // println(Car.Honda.shorthand)

    var m = Months.March

    var value =when (m){
        Months.January -> "Jan"
        Months.February -> "Feb"
        Months.March -> "Mar"
    }

//    println(value)
}