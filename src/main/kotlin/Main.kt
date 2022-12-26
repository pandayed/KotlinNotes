import Coroutines.asyncCoroutine
import Coroutines.coroutineManager
import Coroutines.handleSuspend

fun main(){

    val cities = listOf("Jeddah", "Bengaluru", "Shenzhen", "Abu Dhabi", "Mountain View", "Tripoli", "Bengaluru", "Lima", "Mandalay", "Tripoli")
    val oneWordCities = cities.toSet().toList().filter { !it.contains(" ")}.sorted()
    println(oneWordCities[1])
//    println("Hello World")

//    asyncCoroutine()

//    handleSuspend()

//    varAndVal()
//
//    inputOutput()
//
//    arithmeticOperators()
//
//    ifElseIf()
//
//    ranges()
//
//    nullHandler()


}

//1. kotlin is case-sensitive. //Rose is not rose.
//2. execution in kotlin starts with main function (like C, C++ etc).
//3. semicolons are not necessary at end of statements (no need to put, but if you put then it will ignore).




//to see java code of a kotlin file, keep that file open->Tools->Kotlin->Show Kotlin ByteCode -> Decompile