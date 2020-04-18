package Coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

/*
1.Coroutines make multi taksing easy
 */

fun main(args:Array<String>){

}
/*
Dummy Example to understand in a better way
 */

//Fetching user details by network call
fun fetchUserDetails():User{
    //..
    //..
return User()
}

//Show User Details
//fun showUser(user:User){
//    //..
//    //..
//}

//To update UI from the data recieved from network calls
fun fetchAndShowUser(){
    val user = User()
    showUser(user)
}

class User(){
    //..
    //..
}

/*
Point to note:-
If network call is made on main thread then error will be show
Error :- NetworkOnMainThreadException

So to solve them among many solutions we are going to understand about
Coroutines in another file
 */

/*
Point to Understand from below function:-
*Dispatcher:-
1.Dispatchers helps coroutines in deciding the thread on which the work has to be done.
2.There are majorly three types of Dispatchers which are as IO, Default, and Main.
3.IO dispatcher is used to do the network and disk related work
4.Default is used to do the CPU intensive work
5.Main is the UI thread of Android

In order to use these we have to wrap it under async function

*Suspend
1.Suspend function is a function that could be started,paused or resumed
2.Suspend function can only be called from another suspend function or from a coroutine
 */

suspend fun fetchUser():User{
    return GlobalScope.async(Dispatchers.IO) {
        // make network call
         User() // return user
    }.await()
}

suspend fun cofetchAndShowUser(){
    val user = fetchUser() // fetch to IO thread
    showUser(user)        // back on UI thread
}

fun showUser(user: User) {
    // show user
}

/*
The same thing on android:-
 */

//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//
//    GlobalScope.launch(Dispatchers.Main) {
//        val user = fetchUser() // fetch on IO thread
//        showUser(user) // back on UI thread
//    }
//
//}