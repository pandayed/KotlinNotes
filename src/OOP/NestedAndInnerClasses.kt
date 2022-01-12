package OOP

fun nestedClassManager(){
    val outerObj = Outer()

    //Outer class constructor is not called
    val nestedObj = Outer.Nested()

    //for inner class object outer class object must be created that is why we need to call the constructor
    val innerObj = Outer().Inner()
}

class Outer{

    var p1 = 0

    class Nested{
        //we cannot access outer class members and properties inside the nested class
        fun test(){
            println("Inside of nested class")
        }
    }

    inner class Inner{
        //outer class members and properties inside the inner class
        fun test(){
            println("Inside of inner class. $p1")
        }
    }
}