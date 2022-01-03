fun visibilityModifiers(){
    var c = 20
}


//Top level declarations
//Entities defined in root are top level declarations
//By default top level declarations are public
public class A //no need to write public
var b = 10


//internal means accessible inside the module
internal var d = 20

//accessible withing the same file
private var e = 30

open class D{
    //protected cannot be used for top level declarations
    //protected are accessible in descendant
    protected var f = 30
}

class E:D(){
    var g = f
}