package OOP

fun scopedFunctions(){
    val e1 = Employee("Ramesh", 22, 100000)
    val e1Copy  = e1.apply {
        //apply allows direct access to properties
        age = 24
        salary = 200000
        //this can also be used
        this.salary = 300000
        //apply function returns e1
    }

    e1.let {
        //let has it
        println(it.age)
        println(it.name)
        println(it.salary)
        //let returns the last value in the block
    }

    with(e1){
        //with has this
        age = 30
        salary = 400000
        //with returns the last value in the block
    }

    e1.run{
        age = 32
        //run returns the last value in the block
    }
}

data class Employee(val name: String = "", var age:Int, var salary:Int)