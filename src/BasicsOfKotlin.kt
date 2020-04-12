fun main(args:Array<String>){
//    println("Hello World")
//    var name = "yadvendu"
//    var lastname:String
//    lastname = "Kumar"
//
//    var a:Int = 10
//    var b:Long = a.toLong()
//    println(b)
//
//    println("Enter your name")
//    var name = readLine()
//    println("Enter your age")
//    var read = Scanner(System.`in`)
//    var age = read.nextInt()
//
//    var marks = arrayOf(80,100,60,76,98)
//    for (i in 0 until marks.size){
//        println("marks[$i] " + marks[i])
//    }
//
//    for (item in marks.indices){
//        println("$item : ${marks[item]}")
//    }

   loop@ for (i in 1..5){
        for(j in 1..5){
            if(j==2){
                break@loop
            }
            println(j)
        }
    }
    println("Lopp breaked")
}
