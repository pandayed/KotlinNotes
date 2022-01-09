//1. Data classes are useful when we have to store data only
//2. They do not contain methods
fun dataClassManager(){
    val c1 = Celebrity(100, 20)
    val c2 = Celebrity(100, 20)

    val f1 = Follower(18)
    val f2 = Follower(18)

    println(c1) //when we try to print any object directly, toString (from Any Class) is called
    println((c1.hashCode())) //hashcode also belongs to Any Class

    println(c1==c2)
    //this prints true
    println(f1==f2)
    //this prints false
    //When normal class objects are compared, in actual their address is checked, if they belong to same address then result comes out to be true
    //But for data classes the data inside the objects is compared, not the address

    //copy is utility function of data classes
    val c3 = c2.copy() //copies data of c2 to newly created object c3
    val c4 = c2.copy(200) //copies all data except followers

    //destructuring
    val (followersOfC1, ageOfC1) = c1
    println("$followersOfC1 $ageOfC1")

    //printing components (components means properties)
    //c1 has two components i.e. followers and age
    println(c1.component1())
    println(c2.component2())
}


data class Celebrity(val followers:Int, val age:Int)
class Follower(val age:Int)