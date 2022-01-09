fun inputOutput(){
    //print does not insert new line
    print("Line 1")
    print("Line 2")
    //println inserts new line
    println("Line 3")
    println("Line 4")
    //printing multiple things
    println("hello" + " world")
    println(10 + 20)
    println(10 +10f)
    //println(10 + ": ten") //this will not work, because one is Int and another is String
    val n = 10
    //println(10 + ": ten") //this also will not work
    println(n.toString() + ": ten")
    //variables can also be print inside string by putting $ before them
    println("$n: ten")
    //to put expression in string, enclose that in {}
    println("This is an expression : ${n*2}")
    //literals or variable can be put after a string without type conversion for printing
    //in such cases + concatenates, it does not add
    println("Ten: " + 10 + n)
}