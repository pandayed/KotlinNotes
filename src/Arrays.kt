fun arrays(){
    val arrayInt = arrayOf(1, 2, 3)
    for(x in arrayInt){
        print("$x ")
    }
    println()
    //accessing array with index
    //first comes the index then the element
    for((index, element) in arrayInt.withIndex()){
        println("$index: $element")
    }
    println(arrayInt[0])
    println(arrayInt.get(0))//get can also be used to read the value
    arrayInt.set(0, 10)//set can be used to set value at an index, first parameter is index and the second is the value
    println(arrayInt.size)//for size of array
    //arrayInt[4] gives index out of bound exception
}

fun subtractor(x:Int, y:Int){

}