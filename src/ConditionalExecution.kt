fun ifElseIf(){
    val condition1 = true
    val condition2 = false
    if(condition1){
        println("Condition one is true")
    }else{
        println("Condition one is false")
    }

    if(condition1){
        println("Condition one is true")
    }else if(condition2){
        println("Condition two is true")
    }else{
        println("Both conditions are false")
    }

    //unlike c/c++ kotlin does not allow integers in place of true or false not even 1 and zero
        //    if(1){
        //        //some code
        //    }
    //the above code gives error and can not be executed
}