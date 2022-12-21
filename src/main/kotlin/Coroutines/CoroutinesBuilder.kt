package Coroutines
import kotlinx.coroutines.*

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

fun builders(){
    //launch, async, and runBlocking are most important
    //GlobalScope.launch
    //GlobalScope.async
    //launch and async create coroutines which live as long as the parent activity lives
    //Using GlobalScope we make the coroutine live as long as the application is running
    //use launch only if you want to keep the scope compact
    //Using GlobalScope is more resource consuming hence discouraged.
    //Use GlobalScope only when necessary
    launchCoroutine()
}

fun launchCoroutine(){
    //launch is also called fire and forget coroutine
    //launch coroutine runs on the thread of immediate parent
    runBlocking {
        //runBlocking is running on main thread
        //so launch will run on main thread
        val job : Job = launch {
            delay(100)
            //after a suspending fun, coroutine may change its parent thread
        }

        job.join()
        //the next statement will be executed only after the coroutine finishes
        //using job.cancel() we can also cancel the coroutine
    }
}

fun asyncCoroutine(){
    runBlocking {
        //runs on immediate parent thread
        //returns a deferred job object
        val defJob : Deferred<Int> = async {
            delay(10000)
            15
        }

        val num = defJob.await() //15 gets into the num
        println(num)
        println(20)

        //only cooperative coroutines can be cancelled
        defJob.cancel()
        defJob.join()
        defJob.cancelAndJoin()
    }
}

fun withTimeOutHandler(){
    //When cancelled a coroutine throws coroutine cancellation exception
    //So when cancelling a coroutine, use try catch
    runBlocking {
        withTimeout(200){
            println()
        }

        val t : String? = withTimeoutOrNull(200){
            //this on cancellation does not throw an exception
            //it returns a value on completion and null on cancellation
            "some val"
        }
    }
}

fun handleSuspend() = runBlocking {

    //execution occurs in sequence by default
    val m1 = f1()
    val m2 = f2()
    println(m1)
    println(m2)

    //concurrent execution with return
    val res1 = async { f1() }
    val res2 = async { f2() }

    //concurrent execution without return
    launch { f1() }
    launch { f2() }


    val time = measureTimeMillis {
        //calculates time in milisec taken by this block
    }

    //sometimes we are not sure whether the result returned by a coroutine will be used or not
    //In such case we can lazily call the coroutine
    //calling lazily means, it will be executed if the result is required

    //this won't be executed as v is not used anywhere
    val v = async(start = CoroutineStart.LAZY) { f1() }
}

suspend fun f1():String{
    return "hello"
}
suspend fun f2():String{
    return "world"
}

//Cancellable suspending functions such as yield(), delay() etc. throw CancellationException on the coroutine cancellation.
//You cannot execute a suspending function from the finally block because the coroutine running this code is already cancelled.
//If you want to execute a suspending function from a finally block then wrap the code within withContext(NonCancellable) function.
//You can print your own cancellation message using job.cancel(CancellationException("My crash message")).