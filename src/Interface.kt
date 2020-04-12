/*
we can never create an object of interface directly, instead we can make object of a class implementing the interface and using that
object we can access the members of interface.
 */
interface Player{

    val homeTown:String
    get() = "Kanpur"

    var name:String
    fun runsScored(runs:Int)
    fun inningsPlayed(innings:Int)

    fun printName() {
        println("Name of Player is: $name")
    }

    fun value(){
        println("Value is 10")
    }

}

interface Hobby{
    fun playersHobby(hobby:String)

    fun value(){
        println("Value is 20")
    }

}


class IndianPlayer():Player , Hobby {
    override var name: String=""
        get() = field
        set(value) {
            field = value
        }

    override fun runsScored(runs: Int) {
        println("$name scored $runs runs")
    }

    override fun inningsPlayed(innings: Int) {
        println("$name played total of $innings matches in his career")
    }

    override fun value() {
        super<Player>.value()
        super<Hobby>.value()
        println("Value is 30")
    }


    fun example(objects: IndianPlayer){
        objects.printName()
        println(objects.homeTown)
    }

    override fun playersHobby(hobby: String) {
        println("$name loves $hobby")
    }
}

fun main(args:Array<String>){
    var obj = IndianPlayer()
    obj.name = "Rahul"
    obj.printName()
    obj.runsScored(5000)
    obj.inningsPlayed(80)
    obj.example(obj)
    obj.playersHobby("reading books")
    obj.value()

}

