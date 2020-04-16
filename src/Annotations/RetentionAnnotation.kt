package Annotations

/*
This annotation specifies the availability of the annotated annotation i.e whether the annotation remains in the source file, or it is available at runtime, etc.
 */
@Retention(AnnotationRetention.RUNTIME)
annotation class RetentionAnnotation

@RetentionAnnotation fun main(){
    println("Main Function Annotated")
}