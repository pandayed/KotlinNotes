package Coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun ScopeHandler() = runBlocking {//main thread
    //every coroutine whether a parent or a child has its own coroutine scope (independent of parent/child)
    //scope of every coroutine has a unique scope

    //the context may be inherited from parent

    //Coroutine context has two major components and one un-imp component:
    //1. Dispatcher: Decides the thread on which coroutine will be executed
    //2. Job:
    //3. Coroutine name: (not so imp) //used for debugging purpose

    //if a coroutine is created without any parameter, it will inherit the context of parent
    launch{
        //inherits parent
    }

    launch(Dispatchers.Default) {
        //Similar to GlobalScope.launch
        //runs on a new background thread, with application context
    }

    launch(Dispatchers.Unconfined) {
        //Unconfined means thread may change
        //inherits the context of parent
    }

    //Dispatchers are of 4 types:
    //Default
    //Unconfined
    //Main
    //IO


}