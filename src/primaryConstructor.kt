fun main(args:Array<String>){
    Id("Yadu",23)
    Id("Prateek",19)
}

class Id(var name:String,var age:Int){
    init {
        if (age>20){
            println("$name is applicable to apply for the role")
        }else{
            println("$name's age:$age is less than the criteria to apply for position")
        }
    }
}