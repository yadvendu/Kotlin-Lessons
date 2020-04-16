package Annotations

fun main(){
    println("Working with annotation")

}

/*
we apply an annotation by putting its name prefixed with the @ symbol in front of a code element:
@positive val amount:Float
 */

/*
If an annotation requires a parameter, we provide its value in parenthesis like in a function call:
@SinceKotlin(version = "1.3")
 */

/*
when an annotation parameter is an annotation too, then we should omit the @ symbol:
@Derprecated(message="Use rem instead", replaceWith=ReplaceWith("other"))
 */

/*
If an annotation parameter is a class object, we should add ::class to the class name:
@Throws(IOException::class)
 */

/*
If we need to specify that an annotation parameter may have multiple values, then we just pass an array of those values:
@Throws(exceptionClasses=[IOException::class,IllegalArgumentException::class])
 */

/*
In order to declare an annotation, we define a class and place the annotation keyword before the class one.
 */
annotation class XYZ

/*
Declaration of an annotation that requires a parameter is like a class with a primary constructor:
 */
annotation class Prefix(val prefix:String)

/*
Different type of annotations
@Target
@Retention
@Repeatable
@MustBeDocumented
 */

/*
JVM related annotations:
@JvmName :- permits to change the name of the generated Java method or field
@JvmStatic :- allows us to specify that the generated Java method or field should be static
@JvmOverloads :- indicates that the Kotlin compiler should generate overload functions substituting default parameters
@JvmField :-  indicates that generated Java field should be a public one with no getter/setter
 */