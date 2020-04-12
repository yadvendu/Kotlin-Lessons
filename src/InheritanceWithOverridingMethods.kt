fun main(args:Array<String>){
    var mathObj = Mathsteacher("Singhania",45)
    mathObj.noOfClassTaken()

    var scienceObj = ScienceTeacher("H.C Verma",42)
    scienceObj.noOfClassTaken()
}

open class Teacher(var teacherName:String,var teacherAge:Int){
    init {
        println()
        println("--Teacher Description--")
        println("Name: $teacherName Age: $teacherAge")
    }

    open fun noOfClassTaken(){
        println("Every techer takes three class per day")
    }
}

class Mathsteacher(teacherName: String,teacherAge: Int):Teacher(teacherName,teacherAge){
    override fun noOfClassTaken() {
        super.noOfClassTaken()
        println("$teacherName takes 2 extra class on Monday and Saturday")
    }
}

class ScienceTeacher(teacherName: String,teacherAge: Int):Teacher(teacherName,teacherAge){
    override fun noOfClassTaken() {
        super.noOfClassTaken()
        println("$teacherName take one extra class on Friday")
    }
}
