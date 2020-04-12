interface A{
    fun boo(){
        println("Interface A")
    }

}
interface B{
    fun boo(){
        println("Interface B")
    }
    val name:String
    get() = "Kabir"
}

open class ABC:A,B {
    var newname = "Yadu"
    override fun boo() {
        super<A>.boo()
        super<B>.boo()
        println("Inside class ABC")
    }

}

class XYZ:ABC(){
    override fun boo() {
        println("Inside Xyz")
    }
}

fun main(args:Array<String>){
    var obj = ABC()
    obj.boo()
    var newObj = XYZ()
    example(newObj)
}

fun example(obj:XYZ){
    obj.boo()
}