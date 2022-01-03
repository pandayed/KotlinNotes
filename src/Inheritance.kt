fun phoneManager(){
    val phone1 = BasicPhone()
    phone1.call()
}


//by default classes are final
//final means class cannot be inherited
//to make a class from which another class can be inherited we need to make the class open
//kotlin does not allow a class to have more than one parent like C++
open class Phone(){
    init{
        //parent's constructor is called before child's
        println("Parent's constructor called")
    }
    fun call(){
        println("Calling")
    }
    fun switchOff(){
        println("Switching Off")
    }
}

class BasicPhone():Phone(){
    init {
        println("Child's constructor called")
    }
    fun removeBattery(){
        println("Removing battery")
    }
}

class SmartPhone():Phone(){
    fun takePicture(){
        println("Taking Picture")
    }
}