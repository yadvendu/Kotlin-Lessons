class Z(){
    var name:String=""
    get() = field
    set(value){
        field = value
    }

    var age:Int = 0
    get() = field
    set(value){
        if(value > 30){
            field = value
        }else{
            field = 10
        }
    }
}

fun main(args:Array<String>){
    var obj = Z()
    obj.name = "yadu"
    println(obj.name)

    var ageobj = Z()
    ageobj.age = 20
    println(ageobj.age)
}