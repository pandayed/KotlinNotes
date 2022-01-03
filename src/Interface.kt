fun sweetManager(){
    val sweets = arrayOf(Rasogulla(), Kalakand(), Mathri())
    eatSweet(sweets)
}

fun eatSweet(sweets:Array<Eatable>){
    for(sweet in sweets){
        sweet.eat()
    }
    //Benefit of interface
    //Implement a feature and distribute the behaviour to different classes
}

interface Eatable{
    //By default, the functions defined in interface are abstract
    fun eat()
}


//A class can be inherited from multiple interfaces
abstract class Sweet():Eatable{
    abstract fun shape()
}

class Rasogulla():Sweet(){
    override fun shape() {
        println("Sphere")
    }

    override fun eat() {
        println("Using spoon")
    }
}

class Kalakand():Sweet(){
    override fun shape() {
        println("Cuboid")
    }
    override fun eat() {
        println("Without spoon")
    }
}

class Mathri():Eatable{
    override fun eat() {
        println("Using hands")
    }

}