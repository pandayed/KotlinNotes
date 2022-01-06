fun extensionAndInlineManager(){
    println("Hello".addMyName())
    timeCounter { hasLoops() }
}
//for each lambda function internally a class is created and then an object is created and therefore it is a performance hit
//therefore we use inline function

inline fun myInlineFun(){
    println("In inline function")
}


//extension function for String class
fun String.addMyName():String{
    //this refers to current object
    return "$this Lal Bihari Pandey"
}

//let us say we want to add some methods to a class
//direct changing the class will make the class misbehave
//so better we inherit the class
//what if the class is not open
//in such cases to add more method to the class we use extension functions
//we cannot access private members or properties in extension functions

fun timeCounter(fn:()->Unit){
    val startTime = System.currentTimeMillis()
    fn()
    val endTime = System.currentTimeMillis()
    println(endTime-startTime)
}
fun hasLoops(){
    for(i in 1..50){
        //
    }
}
