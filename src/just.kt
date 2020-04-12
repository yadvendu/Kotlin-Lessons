open class Base(){
    open fun display(){
        println("Inside Base")
    }

    //var name ="Yadu"
}

class Child():Base(){
    override fun display(){
        println("Inside Child")
    }
    var name ="Yadu"
}

fun show(objList:ArrayList<Base>){ //Here objList is of type array list of base class, but form main function we are actually adding object of child class
    for (i in objList){            //but the objlist accepts its because the super class can accept the child class object but not the vice-versa
        i as Child
        println(i.name)
    }
}

fun main(args:Array<String>){
//    var a:Base = Base
//    a.display()
//    var b:Child = Child()
//    b.display()
    var list = ArrayList<Base>()

    for (i in 1..10){
        var obj = Child()
        obj.name = "Yadu"
        list.add(obj)
    }
    show(list)
}

