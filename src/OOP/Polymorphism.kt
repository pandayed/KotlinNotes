fun shapeManager(){
    val c1 : Circle = Circle(1.1)
    val s1 : Square = Square(2.2)
    println(c1.area())
    println(s1.area())

    //Polymorphism allows us to create objects with Parent datatype and hold the reference of child
    //Polymorphism allows us to call the children's members which are common
    val c2 : Shape = Circle(1.1)
    val s2 : Shape = Square(2.2)

    println(c2.area())
    println(s2.area())

    //we can pass shape object as well as any child class object to printArea
    //child can be in place of parent but vice versa is not true
    printArea(c2)

}

open class Shape(){
    open fun area():Double{
        return 0.0
    }
}

class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}

class Square(val side:Double):Shape(){
    override fun area(): Double {
        return side*side
    }
}

class Triangle(val base:Double, val height:Double):Shape(){
    override fun area(): Double {
        return 0.5*base*height
    }
}

fun printArea(shape: Shape){
    println(shape.area())
}
//Benefit of Polymorphism
fun calculateArea(){
    val shapes: Array<Shape> = arrayOf(Circle(1.1), Square(2.2))
    //here s can call the area member only, it can not interfere with other members present (which are not common)
    //common code for all children, i.e. Circle and Square
    for(s in shapes){
        println(s.area())
    }
}
//when we call a member the member is checked in current class then in parent then in parent's parent and so on