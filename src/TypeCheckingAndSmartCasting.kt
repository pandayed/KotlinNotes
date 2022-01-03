fun typeCheckingAndSmartCasting(){
    val heroHonda = Bike()
    val terminator = Cycle()
    val vehicles = arrayOf(heroHonda, terminator)
    printUse(vehicles)
}

fun printUse(vehicles: Array<MeansOfTransport>){
    for(vehicle in vehicles){
        //"is" is used to check to determine to which class the object belongs
        if(vehicle is Bike){
            //inside this if block if we write vehicle. then we will be suggested the methods and properties of Bike
            //because vehicle which is MeansOfTransport is smartCasted to Bike
            //but is else block smartCast does not work
            println("For long distance use and takes fuel")
        }
        if(vehicle is Cycle){
            println("For short distance and does not take fuel")
        }
        //Manual Casting
        //(vehicle as Bike).use()
        //the above line gives error for now because the vehicle when is Cycle, cannot be casted to Bike


    }
}

//TypeChecking means checking the type of the object at runtime

interface MeansOfTransport{
    fun use()
}

class Bike():MeansOfTransport{
    override fun use(){
        println("For long distance")
    }
}

class Cycle():MeansOfTransport{
    override fun use() {
        println("For short distance")
    }
}