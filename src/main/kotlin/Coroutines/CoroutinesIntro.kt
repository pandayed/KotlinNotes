package Coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
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

    //Background coroutine in some background thread
    //Main thread is unaware of this coroutine. So main thread won't wait for this.
    GlobalScope.launch {
        //Blocks the thread for 500 ms
        Thread.sleep(500)
        println(Thread.currentThread().name)
        //DefaultDispatcher-worker-1 will be printed, if coroutine gets executed
        delay(500)//Delay suspends the coroutine, and does not affect the thread
        //delay is a suspend funtion and
        //any suspend function may cause the coroutine to shift to some another thread. Shifting does not happen always.
    }

    runBlocking {
        //This coroutine does not run on any new thread
        //Rather it runs on the current thread
        //Creates a coroutine that blocks the current thread
        delay(100)
    }


    //Blocking main thread so that coroutine can get executed
    Thread.sleep(2000)

    //Always keep a track of the threads you create
}

