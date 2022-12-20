fun myFun():Unit{
    val res = adder(10, 20)
    println(res)
    sayMyName("Lal Bihari")
    pets(pet2="Horse", pet1="Dog")
}
//default return type is Unit
fun adder(x:Int, y:Int, z:Int=30):Int{
    //x y z are val, that is they can not be reassigned
    return x+y+z
}

//inline function
fun adder1(x:Int, y:Int):Int = x+y //returns x+y
fun adder2(x:Int, y:Int) = x+y //returns x+y //Return type is not mandatory for this case

//Function overloading
//For overloading the parameters list must be different

//for two parameters only this will be called, because for one parameter there is another function
fun sayMyName(firstName: String, secondName:String="Pandey"){
    println("$firstName $secondName")
}

fun sayMyName(firstName: String){
    println(firstName)
}

fun sayMyName(){
    println("No name passed")
}

//named arguments
fun pets(pet1:String, pet2:String){
    println("pet1: $pet1, pet2: $pet2")
}

//in kotlin we can store functions in kotlin
fun temporary(){
    //right click on identifier of variable -> show context actions -> specify type explicitly
    var funHold: (city: String) -> Unit = ::myCity
    funHold("Vrindavan")
    funHold = ::myState
    //funHold can store any function with same parameter list

}
fun myCity(city:String){
    println(city)
}
fun myState(state:String){
    println("State: $state")
}