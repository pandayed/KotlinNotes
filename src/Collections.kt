fun collectionManager(){
    var numArray = arrayOf(1, 2, 3)
    //arrays have fixed size

    //Lists
    //mutable: insertion, deletion, replacement possible
    //immutable: none of above operations allowed
    //By default the collections are immutable
    val numList = listOf(1, 2, 3)
    println(numList.contains(8))
    val mutableNumList = mutableListOf(1, 2, 3)
    val mutableNumList2 = mutableListOf(4, 5, 6)

    //adds the second list to first
    mutableNumList.addAll(mutableNumList2)

    //Maps
    val students = mutableMapOf<Int, String>()
    students.put(1, "Akash")
    students.put(2, "Daksh")
    students[3] = "Jay"
    println(students.get(1))
    println(students.get(11))//prints null because 11 key doest not exist
    for((key, value) in students){
        println("$key $value")
    }
    val teachers = mapOf(1 to "Rakesh", 2 to "Manoj") //to operator is used to map key values in immutable maps

}