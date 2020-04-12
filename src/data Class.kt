data class User(var name:String,var age:String){

}

fun main(args:Array<String>){
    val user = User("Ram","28")
    println("Name:${user.name} Age:${user.age}")

    //Using copy() function for data class
    val userTwo = user.copy(name = "Yadu")
    println("Name:${userTwo.name} Age:${userTwo.age}")

    var userThree = user.copy()

    //Using toString() function for data class
    println(user.toString())

    //using hashCode() function for data class
    println("UserOne has code ${user.hashCode()}")
    println("UserTwo has code ${userTwo.hashCode()}")
    println("UserThree has code ${userThree.hashCode()}")

    //using equals to confirm hashCode
    if (user.equals(userThree)){
        println("Both UserOne and UserThree are equal")
    }else{
        println("Both are not equal")
    }

    if (user === userThree){
        println("Both have same reference")
    }else{
        println("Both have different reference")
    }

    //destructing declaration
    val rahul = User("Rahul","29")
    val (name,age) = rahul
    println("$name's age is $age")
}
