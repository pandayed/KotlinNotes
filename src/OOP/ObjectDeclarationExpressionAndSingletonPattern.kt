fun objectHandler(){
    println(Me.age)
    Me.age++
}


//Object Declaration
//Direct class and one object can be created, not multiple objects
//No constructors allowed
//init block is allowed
//Can be inherited from class and interface

object Me{
    const val name: String = "Lal Bihari Pandey"
    var age = 20
}
//singleton pattern : only one object is allowed for a class
//for object keyword, behind the scenes class is created and an object is created

//Object Expression
//Replacement of Java's anonymous class
//Anonymous objects can be created

interface TopperGuys{
    fun study()
}

open class EarlyRisers(){
    open fun wakeUp(){
        println("Wake up it is 3 am")
    }
}
fun forAnonymousObject(){
    val myFriend = object {
        val age= 20
        fun shout(){
            println("Koo Hoo")
        }
    }
    println(myFriend.age)
    println(myFriend.shout())

    //object expression can be inherited from class or interface
    val firstBencher = object:TopperGuys, EarlyRisers() {
        val age = 20
        override fun wakeUp() {
            super.wakeUp()//super lets us call the parent's method
            println("I will wake up after I end my revision in dream")
        }
        override fun study() {
            println("Studying")
        }
    }
    firstBencher.wakeUp()
}