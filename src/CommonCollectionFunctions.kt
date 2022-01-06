fun collectionFunctionManager() {
    val nums = listOf(1, 2, 3)


    //we have filter function for lists
    //filter does not include if the result is false
    val list = nums.filter(::isOdd)
    println(list)

    val list2 = nums.filter{ a->a%2!=0 }
    println(list2)

    val list3 = nums.filter { it%2!=0 }
    println(list3)

    //map function: converts one form to another
    val listSquares = nums.map { it*it }
    println(listSquares)

    for(i in nums){
        print("$i ")
    }
    println()
    //for each
    nums.forEach{print("$it ")}

}

fun isOdd(a:Int):Boolean{
    return a%2!=0
}