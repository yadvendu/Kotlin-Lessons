package References

class XYZ(){
    val name = "Yadu"
}

fun abc(obj:XYZ){
    println(obj.name)
    val checkedInputStream:String
}

fun main(args:Array<String>){
    println("--Working with constructor refrences--")
    val y = ::XYZ
    println(y.name)
    abc(y())
}