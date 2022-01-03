fun abstractManager(){

}

abstract class Laptop(){
    //A class which contains abstract method must be declared abstract
    //Abstract classes are open, so no need to write open (although we can write)
    //Different laptops may have different animation method, so we cannot give a default body to this function
    //We cannot create instance i.e. object of abstract class
    //An abstract method must not have a body
    //Not all members/properties of abstract class need to be abstract. i.e. a class can have some abstract and some non-abstract things

    abstract fun startAnimation()
}

class HP():Laptop(){
    //abstract methods must bae overwritten
    override fun startAnimation() {
        println("Fade animation")
    }
}


