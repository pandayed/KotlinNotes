fun myFun():Unit{
    val res = adder(10, 20)
    println(res)
}
//default return type is Unit
fun adder(x:Int, y:Int, z:Int=30):Int{
    //x y z are val, that is they can not be reassigned
    return x+y+z
}

//inline function
fun adder1(x:Int, y:Int):Int = x+y //returns x+y
fun adder2(x:Int, y:Int) = x+y //returns x+y //Return type is not mandatory for this case
