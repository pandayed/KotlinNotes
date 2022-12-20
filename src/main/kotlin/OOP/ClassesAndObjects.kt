class Car(val name:String, val type:String, var kmRan:Int){
    //the round brackets works as the primary constructor
    fun driveCar(){
        println("Drive car")
    }
    fun applyBrakes(){
        println("Brakes Applied")
    }
}

class Person(var firstName:String, middleName:String){
    //firstName is a property, middleName is a parameter

    //properties must be initialized.
    //initializing property saves us from runtime error which happens in many languages
    var name:String = "Lal Bihari"
    val age:Int = 16
    //if the properties are needed to be set while object declaration only, then better put these properties in primary constructor
    var fName = firstName //this also works
    var canVote = age>18 //evaluated parameter
    //initializer blocks are executed in sequence, and are automatically called when an object is created
    init{
        println("Hey, I can see you created an object")
    }
    init{
        println("Hey 2")
    }
    //secondary constructor:
    //secondary constructor must call primary constructor
    //primary cons. is called using keyword this
    constructor(nickName:String):this("Lal", "Bihari")
}


fun forClass(){
    val mustang = Car("Mustang", "Petrol", 100)
    mustang.driveCar()
    mustang.applyBrakes()
    mustang.kmRan = 200

    val person1 = Person("Lal", "Bihari")//primary constructor called
    val person2 = Person("SomeName")//secondary constructor called
    person1.name = "Lal Bihari Pandey"
    //age cannot be reassigned because it is val
}
