fun lambdaHandler(){

    //the body of lambda function is written after the ->
    //last line of lambda is return type
    val lambda1 = {x: Int, y:Int -> x+y}
    val multiLineLambda = {
        val a : Int = 2+3
        a
    }
    println(lambda1(10, 20))
    println(multiLineLambda())
    val greet : (String)->Unit = {name-> println("Hello $name")}
    greet("Peter")

    //We do not need extra variable for single parameter lambdas
    //it is used to get the value of single parameter
    val singleParameterLambda : (String)->Unit = { println("Hello $it")}

    singleParameterLambda("Octo")

    //passing lambda function
    calculator(10, 30, {a, b->a+b})
    calculator(10, 30) {a, b->a+b} //the above line is also correct
    //when we have last argument as lambda, we can pass that outside the round brackets
}

fun calculator(a:Int, b:Int, op:(Int, Int)->Int):Int{
    return op(a, b)
}
