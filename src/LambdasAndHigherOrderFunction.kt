fun main(args:Array<String>){
    //add(5,6)
   var add:(Int,Int)->Int = {num1:Int,num2:Int-> num1+num2}
   var show:(Int)->Unit = {sum:Int->println("Total sum is $sum")}
    sum(5,6,add,show)
    seename("Yadu")

}
fun sum(a:Int,b:Int,add:(Int,Int)->Int,itprints:(Int)->Unit){
    val sum = add(a,b)
    itprints(sum)
}

var seename:(String)->Unit = {name:String -> println("Hi $name")}
