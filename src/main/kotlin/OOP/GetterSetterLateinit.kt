fun classManager(){
    val object1 = Calculator() //default constructor called //default constructor is parameter-less
    println(object1.add(2, 3))

    val pet1 = Animal("Doggo", 2)
    //we can get and set petName directly because it does not have getter and setter
    //direct access to properties does not allow us to conveniently put check of the value of the properties
    pet1.petAge = -10
    println(pet1.petAge)
}

class Calculator(){

    //if we do not know, with what value the property should be initialized, we can need to tell explicitly be using keyword lateinit
    //Rules for lateinit properties
    //1: var only, not val
    //2: not allowed for Int, Boolean and Float
    lateinit var message: String

    fun add(a:Int, b:Int):Int = a+b
    fun multiply(a: Int, b:Int) = a*b
}

class Animal(name:String, age:Int){
    //name and age are parameters and petName and petAge are properties
    var petName:String = name
    var petAge:Int = age
    set(value) {
        if(value>0){
            field = value
        }else{
            println("Age can not be negative")
        }
    }
    get() {
        println("Sending petAge")
        return field
    }
    //to make setter of the property and write set just below the property and it receives the value and puts the value according to the condition in the field
    //field is nothing but the property

    //for a property if we do not make getter and setter, default getter and setter work
    var color:String=""
    get() = field
    set(value){
        field=value
    }
}