fun varAndVal(){

    //ctrl+shift+p on identifier shows its datatype

    //var can be reassigned
    var num = 10
    println(num)
    num = 20
    println(num)

    //val can not be reassigned
    val myString = "Hello"
    //myString = "World"
    println(myString)

    //val or var both need not be initialized, but for that we need to specify datatype

    dataTypes()
}


fun dataTypes(){

    var score : Int = 10
    var temperature: Float = 12f //12F will also work
    //Float datatype values must end with F or f
    var moles: Double = 2.22334455
    var name : String = "Lal Bihari Pandey"
    var isItRaining : Boolean = false
    var initial : Char = 'E'


    var amISmart : Boolean = false

}

