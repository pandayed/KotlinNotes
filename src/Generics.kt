fun genericsHandler(){
    val obj = Container<Int>(20)
    obj.printer()
    val obj2 = Container<String>("Hello")
    obj2.printer()

    doSum(1,2, 3)
    doSum(1, 2, 3, 4, 5, 6, 7, 8, 9)
}

class Container<Type>(var data:Type){
    fun printer(){
        println(data)
    }
}


//vararg allows to pass multiple variables and makes an array of those
fun doSum(vararg values:Int){
    //values is the array of the values passed
    var sum:Int = 0
    for(i in values){
        sum+=i
    }
}