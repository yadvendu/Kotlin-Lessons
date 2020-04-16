package Annotations

/*
1.This annotation allows an element to be annotated with the same annotation multiple times
2.This annotation can only be used with the Retention Policy set to SOURCE.
 */

@Repeatable
@Retention(AnnotationRetention.SOURCE)
annotation class RepeatableAnnotation(val value:Int)

@RepeatableAnnotation(5)
@RepeatableAnnotation(6)
fun main(){
    println("Repetable annonation applied on main")
}