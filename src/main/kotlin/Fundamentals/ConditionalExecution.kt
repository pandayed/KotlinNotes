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

    //if else can return values
    val result = if(condition1){
        "Condition one is true"
    }else if(condition2){
        "Condition two is true"
    }else{
        "Both conditions are false"
    }
    //the last expression of block is the return expression
    println(result)

    switchCase()
}

fun switchCase(){
    //In place of switch-case we have when
    val n = 10
    when(n){
        10->{
            println("The value is 10")
        }
        20->{
            println("The value is 20")
        }
        else->{
            println("Value not detected")
        }
    }

    //like if else when can also return value
    val result =  when(10){
        10->{
            "The value is 10"
        }
        20->{
            "The value is 20"
        }
        else->{
            "Value not detected"
        }
    }
}