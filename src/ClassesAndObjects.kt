class Car(val name:String, val type:String, var kmRan:Int){
    fun driveCar(){
        println("Drive car")
    }
    fun applyBrakes(){
        println("Brakes Applied")
    }
}

fun forClass(){
    val mustang = Car("Mustang", "Petrol", 100)
    mustang.driveCar()
    mustang.applyBrakes()
    mustang.kmRan = 200

}