fun myFun():Unit{
    val res = adder(10, 20)
    println(res)
    sayMyName("Lal Bihari")
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