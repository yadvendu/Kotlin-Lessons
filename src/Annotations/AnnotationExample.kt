package Annotations

@Target(AnnotationTarget.CLASS,AnnotationTarget.EXPRESSION,AnnotationTarget.EXPRESSION,AnnotationTarget.FUNCTION,AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.CONSTRUCTOR)
@Retention(AnnotationRetention.SOURCE)
annotation class Fancy
annotation class NewFancy(val a:Int)

@Fancy class Foo @Fancy constructor(){
    @Fancy fun baz(@Fancy foo:Int):Int{
        return (@Fancy 1)
    }
}
/*
Point to remember:
Allowed types for annotation parameter are primitive type,strings,classes(Foo::class),enums,other annotations and array of all listed items
 */

@NewFancy(1) class NewFoo{

}

