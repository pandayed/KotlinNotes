fun companionObjHandler(){
    MyClass.MyObject1.message1()
    MyClass.message2()
}

class MyClass(){
    //the objects declared inside the class are associated with the class,
    //so for any number of objects of this class there will be same instance of the object
    object MyObject1{
        fun message1(){
            println("Message 1")
        }
    }

    //one class can have only one companion object
    //companion object is same as above
    //but the members and properties are directly accessible by the class

    companion object MyObject2{
        @JvmStatic
        fun message2(){
            println("Message 2")
        }
    }
    //kotlin does not have static keyword
    //Java and kotlin code can be operated in same project and can pass execution between them
    //If Java tries calling MyClass.message2 it will not be able to do because message2 is not static
    //to make it work like MyClass.message2 we have added @Jvmstatic
    //Jvmstatic tells that the function will work as static in Java

}

//companion objects are used for factory patters