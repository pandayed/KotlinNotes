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
    //.plus
    val d = a.plus(b)

    relationalOperators()

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

    incrementDecrement()
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

    logicalOperators()

}

fun logicalOperators(){
    val condition1  = true
    val condition2 = false

    println(condition1 || condition2)
    println(condition1 && condition2)
    println(!condition1)


    //Short circuit
    var a = 10
    val result1 = true || ++a==11
    println(a)
    val result2 = false && --a==10
    println(a)
    //In both the above cases the second condition/expression is not executed because the result can solely be decided by first condition
    //this is called short-circuiting



}