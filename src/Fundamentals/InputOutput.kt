fun inputOutput(){

    //print does not insert new line
    print("Line 1")
    print("Line 2")

    //println inserts new line
    println("Line 3")
    println("Line 4")

    //printing multiple entities
    println("hello" + " world")
    println(10 + 20)
    println(10 + 10f)

    //println(10 + ": ten") //this will not work, because one is Int and another is String
    val n = 10

    println(n.toString() + ": ten")

    //literals or variable can be put after a string without type conversion for printing
    //in such cases + concatenates, it does not add
    println("Ten: " + 10 + n + true + 'E')


    //variables can also be print inside string by putting $ before them
    println("$n: ten")

    //to put expression in string, enclose that in {}
    println("This is an expression : ${n*2}")


    print("Enter r: ")
    val r = readLine()//.toInt()
    val t = "10"
    val s = 10 + t.toInt() // + r
    println("r: $r" + "\ns: $s")

    val speech = readLine()
    println("Speech: $speech")


}