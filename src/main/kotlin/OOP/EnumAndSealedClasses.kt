import java.util.*

fun enumAndSealedManager(){
    val day = Day.Monday
    println(day)
    val month = Month.January
    println(month)

    //we can traverse across the values of an enum class
    for(d in Day.values()){
        println(d)
    }
    month.printInUppercase()

    val s1 = Sherwani("Wedding")
    val cp1 = CoatPants("Blue")
    val dress : Dress = CoatPants("Black")

}

//enum classes
//let us say we want to a variable to have values from a set only
//for example day variable can have sunday-saturday values
//such cases are handled conveniently with enum classes

enum class Day(){
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
    //The above values are instances of the Day Class
}

//enum can have constructors
enum class Month(val num:Int){
    //we need to call the constructor, because we are creating an instance
    January(1),//whether in same or different line the instances must be separated with comma
    February(2) ; //after the last value semicolon is mandatory

    fun printInUppercase(){
        //this keyword is used to access the object for which it is called
        println(this.toString().uppercase(Locale.getDefault()))
    }
}

//Sealed Classes
//in enum classes we have restricted values
//in sealed classes we have restricted types
//Let us we want to have 4 TYPES of dresses only : D1, D2, D3, D4
//each of which can be available in any color
//if we create these 4 instances in enum we cannot assign different colors to the dress

sealed class Dress()
class Sherwani(val occasion:String):Dress()
class CoatPants(val color:String):Dress()
//the types of Dress must be defined in the same file