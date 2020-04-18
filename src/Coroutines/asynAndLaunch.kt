package Coroutines

import kotlinx.coroutines.*

/*
Points to Remember :-
1.Launch does not retirn anything and aysnc retirn an instance of Deferred<T>,which has await() function that returns that returns the result of coroutine
 */

/*
Understanding launch
 */
fun fetchUserAndSaveInDatabase() {
    // fetch user from network
    // save user in database
    // and do not return anything
}

/*
As the above function does not repeat anything we can use launch
 */

fun launchCoroutine(){
    GlobalScope.launch(Dispatchers.IO) {
        fetchUserAndSaveInDatabase() // do on IO thread
    }
}

/*
Understanding async
 */

fun fetchFirstUser(): User {
    // make network call
     return User()
}

fun fetchSeconeUser(): User {
    // make network call
    return User()
}

fun showUsers(obj1:User,obj2:User){

}

/*
As the above function are returning an object of user we will use async
 */

fun useOfAsync(){
    GlobalScope.launch(Dispatchers.Main) {
        val userOne = async(Dispatchers.IO) { fetchFirstUser()  } //fetch on IO thread
        val userTwo = async(Dispatchers.IO) { fetchSeconeUser() } //fetch on IO thread
        showUsers(userOne.await(),userTwo.await()) // back on Ui thread
    }
}

/*
Understanding withContext:
1.withContext is same as async only diffrence is that we dont have to use await()
 */

suspend fun usingWithContext(){
   return withContext(Dispatchers.IO){
       // make network call
       // return user
   }
}
class Context(){
    lateinit var userOne:User
    lateinit var userTwo:User
    fun sameAsAbove(){
        GlobalScope.launch(Dispatchers.Main) {
            withContext(Dispatchers.IO){
                userOne = fetchFirstUser()
                userTwo = fetchSeconeUser()
            }
            showUsers(userOne,userTwo) // back on Ui thread
        }
    }
}

class UserNew(){

}