package Coroutines

import kotlin.concurrent.thread

//Notes from smartherd
// https://www.youtube.com/watch?v=lmRzRKIsn1g


//Main thread is automatically created // good for light tasks
//We can create background threads for heavy operations
//Threads have their weight too. So device may run out of memory if a lot of threads are created
//On one background thread we can have many coroutines
//Light-weight Threads
//Like threads, coroutines can run in parallel, wait for each other, and communicate with each other.
//Coroutine != Thread
//Coroutines are very cheap - almost free. Create thousands of them without any memory issue.
//"Best for modern applications"

fun coroutineManager(){
    println(Thread.currentThread().name)

    //creating a thread
    thread {
        println(Thread.currentThread().name)
    }
    //Threads will run in parallel

}

