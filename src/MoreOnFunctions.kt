fun funManager(){
    //functions in kotlin are called first class citizens
    //functions can be stored in variables
    //functions can be received and passed as parameters and arguments
    //functions can return functions
    var fn1 = ::bark
    fn1 = ::mew
    fn1("Shimmy")
    val fn2 = ::bark

    sound(fn1,fn2)
}

fun bark(name: String):String{
    println("$name barks")
    return "mew"
}
fun mew(name: String):String{
    println("$name mews")
    return "mew"
}

//Higher order function:
//Either receives one or more functions as parameter
//Or returns a function
//Or does both

fun sound(bark:(String)->String, mew:(String)->String){
    bark("Tommy")
    mew("Jimmy")
}