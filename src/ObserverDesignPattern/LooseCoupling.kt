package ObserverDesignPattern

/*
*Loose Coupling:-
1.loose coupling means they are mostly independent
2. f the only knowledge that class A has about class B, is what class B has exposed through its interface,
then class A and class B are said to be loosely coupled
 */

fun main(args:Array<String>){
    println("--Understanding loose coupling--")
    val objAnd = NewAndroidDeveloper()
    val objMan = NewManager(objAnd)
    objMan.letsSeeWork()

    val objBack = NewBackendDeveloper()
    val objMan1 = NewManager(objBack)
    objMan1.letsSeeWork()
}

interface KnowsWork{
    fun work()
}

class NewManager(val obj:KnowsWork){
    fun letsSeeWork(){
        obj.work()
    }
}

class NewAndroidDeveloper():KnowsWork{
    override fun work() {
        println("Works on Android Platform")
    }
}

class NewIosDeveloper():KnowsWork{
    override fun work() {
        println("Works on iOS Platform")
    }
}

class NewBackendDeveloper():KnowsWork{
    override fun work() {
        println("Works on Backend platform")
    }
}