fun main(args:Array<String>){
     Student("Prakash",1320,82,89,75)
}

class Student(var name:String,var id:Int){
    init {
        println("Student Name : $name")
        println("Student Id: $id")
    }

    var totalMarks:Int = -1

    constructor(name: String,id: Int,maths:Int,english:Int,science:Int):this(name,id){
        println("--Subject marks--")
        println("Maths: $maths")
        println("English: $english")
        println("Science: $science")

        totalMarks = maths+english+science
        println("Total Marks: $totalMarks")

    }
}