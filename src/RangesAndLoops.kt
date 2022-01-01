fun ranges(){
    //representing ranges
    1..10
    1 until 10

    //in operator
    val result1  =  1 in 1..5 //1, 2, 3, 4 //5 included
    val result2 = 1 in 1 until 5 //1, 2, 3, 4, //5 excluded
    //in operator can be used to check if number lies in range or not

}

fun loops(){
    //in operator can be used for traversal in a range
    for(x in 1..10){
        println(x)
    }
    println("----------")
    for(x in 1 until 10){
        println(x)
    }
    println("----------")

    //step

    for(x in 1..10 step 2){
        println(x)
    }
    println("----------")
    println("downTo:")
    for(x in 10 downTo 1){
        println(x)
    }

    println("----------")
    var x=10
    while(x>0){
        println(x)
        x--
    }

    println("----------")
    do{
        println(x)
        x++
    }while(x<=9)
}