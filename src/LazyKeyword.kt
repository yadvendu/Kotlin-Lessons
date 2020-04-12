val a:Int  by lazy { 32 } //lazy is used when we need only a single instance of variable used across different places
fun main(args:Array<String>){
    println(a)
}