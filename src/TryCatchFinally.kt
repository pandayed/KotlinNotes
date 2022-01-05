import java.lang.IllegalArgumentException

fun tryCatchFinally(){
    val array = arrayOf(1, 2, 3)

    //try block must be followed with catch or finally
    try{
        //error prone code
        println(array[5])
    }catch (e: Exception){
        //this block will only be executed if the above block produces some error
        println(e.message)
    }finally {
        //this block will always be executed
        println("This is final block")
    }

    //we can create multiple catch blocks
    try{
        println(array[5])
    }catch (e:IndexOutOfBoundsException){
        println("Out of bound")
    }catch (e: Exception){
        println("Unknown exception")
    }finally {
        println("In final block")
    }

    //throw: is used to intentionally throw error
    val count = -2
    if(count<0){
        throw IllegalArgumentException("Count must be greater than 0")
    }
}