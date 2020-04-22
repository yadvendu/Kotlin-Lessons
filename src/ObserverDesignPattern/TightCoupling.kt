package ObserverDesignPattern

/*
Note:-
Thre are two types of coupling:-
1.Tight Coupling
2.Loose Coupling

*Tight Coupling:-
1.Tight coupling means two classes often change together
2. if A knows more than it should about the way in which B was implemented, then A and B are tightly coupled
3.There is direct depedency between the classes
 */

fun main(args:Array<String>){
    println("--Understanding tight coupling--")
    val objAnd = AndroidDeveloper()
    val objIos = IosDeveloper()
    val manager = Manager(objAnd,objIos)
    manager.knowsWork()
}

class Manager(var androidObj:AndroidDeveloper,var iosObject:IosDeveloper){
    fun knowsWork(){
        androidObj.work()
        iosObject.work()
    }
}

class AndroidDeveloper(){
    fun work(){
        println("Works on Android Platform")
    }
}

class IosDeveloper(){
    fun work(){
        println("Works on iOS Platform")
    }
}

//class BackendDeveloper(){
//    fun work(){
//        println("Works on Backend Platform")
//    }
//}
