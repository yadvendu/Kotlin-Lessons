package Annotations

/*
This annotation specifies the places where the annotated annotation can be applied such as classes, functions, constructors, type parameters, etc
 */

@Target(AnnotationTarget.CONSTRUCTOR,AnnotationTarget.LOCAL_VARIABLE)
annotation class TargetAnnotation


class ABC @TargetAnnotation constructor(val count:Int){
    fun display(){
        println("Constructors annotated")
        println("Count is $count")
    }
}

fun main(args:Array<String>){
    val obj = ABC(5)
    obj.display()
    @TargetAnnotation val message:String
    message = "Hello"
    println("Local parameter annotated")
    println(message)

}