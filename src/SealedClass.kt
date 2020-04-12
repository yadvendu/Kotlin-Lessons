sealed class Fruit(var name:String){
    class Apple:Fruit("Apple")
    class Mango:Fruit("Mango")
}

class Guava:Fruit("Guava")

fun display(fruit: Fruit){
    var x = when (fruit){
        is Fruit.Apple -> println(fruit.name)
        is Fruit.Mango -> println(fruit.name)
        is Guava -> println(fruit.name)
    }
}
fun main(args:Array<String>){
   // var obj = Fruit("Guava")
    var obj1 = Fruit.Apple()
    var obj2 = Fruit.Mango()
    var obj3 = Guava()

    display(obj1)
    display(obj2)
    display(obj3)
}