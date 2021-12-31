fun arithmeticOperators(){

    //if any of the number is decimal then only result will be decimal
    val a = 10
    val b = 12.22
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(b.toInt()%a)

    //we can do interconversions using toDataType functions
    val c = a.toFloat()
    println(a)
    println(c)

}

fun relationalOperators(){
    val a = 10
    val b = 20
    val c = 10

    println(a>b)
    println(a>=b)

    println(a<b)
    println(a<=b)

    println(a==b)
    println(a!=b)
}

fun incrementDecrement(){

    var a=10
    var b=20
    println(++a)
    println(b++)

    var c = 1
    var d = 2
    println(--c)
    println(d--)
}