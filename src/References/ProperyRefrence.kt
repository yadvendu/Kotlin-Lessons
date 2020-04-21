package References

class ABC(var x:Int){
}

var b = 20

fun main(){
    println("--Working with property references")
    val z = ::b
    println(z.get())
    println(z.name)

    z.set(50)
    println(b)

    println()
    println("--Working with class property reference--")
    val value = ABC::x
    println(value.get(ABC(10)))
}