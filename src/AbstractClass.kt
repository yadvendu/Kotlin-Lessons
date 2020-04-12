abstract class Person(var name:String){
    init {
        println("My name is: $name")
    }

    fun displayWorkLocation(place:String){
        println("My work place is: $place")
    }

    abstract fun displayJobTile(designation:String)
}


class Enginner(name: String):Person(name){
    override fun displayJobTile(designation: String) {
        println("My job title is: $designation")

    }
}

fun main(args:Array<String>){
    val obj = Enginner("Prateek")
    obj.displayJobTile("Software Engineer")
    obj.displayWorkLocation("Bangalore")
}