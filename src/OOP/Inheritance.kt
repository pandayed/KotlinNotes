fun phoneManager(){
    val phone1 = BasicPhone()
    phone1.call()
    val doog = Labrador()
    val cheems = RandomDog("GermanShepherd")
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

open class SmartPhone():Phone(){
    //only open functions/properties can ve overrided in children classes
    //by default functions/properties are also final
    open fun takePicture(){
        println("Taking Picture")
    }
}
class SpecialPhone():SmartPhone(){
    //override keyword is used to override a property or function
    override fun takePicture() {
        println("Opening multiple cameras, taking picture")
    }

}

//class with parametrized primary constructor
open class Dog(breed:String){
    open fun bark(){
        println("Bark")
    }
}

class Labrador():Dog("Labrador"){
    fun sayMyName(){
        println("Doggo")
    }
}

class RandomDog(val breed:String):Dog(breed){
    override fun bark() {
        //super keyword lets us call the parent's method
        super.bark()
        println("Bark loud")
    }
    //just like properties/methods we can also override getters and setters
}

//Every class in Kotlin default parent Any class
//It has many methods which are all open and hence can be overrided