package OOPs_Concept

interface Vehicle {
    fun start()
    fun stop()
}

class Car: Vehicle{
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }
}



// *********************** Default values and Default Methods *****************************

/*
    Methods in an interface can have default values for its parameters. If the value for a parameter is not provided
    at the time of function call, then the default value is used. Also, the methods can have default implementations.
    These are used in the case where the method is not overridden. So we don't need to override them necessarily and
    give definition.
 */

interface FirstInterface {
    fun add(a: Int = 6, b: Int)
    // No need to necessarily override print() since default implementation is provided
    fun print(){
        println("This is a default method defined in the interface")
    }
}

class InterfaceDemo : FirstInterface {
    override fun add(a: Int, b: Int) {
        val x = a + b
        println("Sum is $x")
    }

    // Won't get any compile time error even if not overridden
    override fun print() {
        super.print()
        println("It has been overridden")
    }
}



// *********************** Properties in interface *****************************

/*
    Just like methods, interfaces can also contain properties. However, since the interface doesn’t have a state that is,
    they can’t be instantiated, so there are no backing fields to hold their values. Hence, the fields in the interface
    are either left abstract or are provided an implementation.
*/

interface InterfaceProperties {
    val a : Int
    // Not necessary to override if value is provided through getter
    val b : String
        get() = "Hello"
}

class PropertiesDemo : InterfaceProperties {
    override val a : Int = 5000
    override val b : String = "Property Overridden"
}



// *********************** Inheritance in interface *****************************

/*
    When an interface extends another interface, it can add its own properties and methods, and the implementing type
    has to provide a definition for all the properties and methods in both the interfaces. An interface can inherit
    more than one interface.
 */

interface Dimensions {
    val length : Double
    val breadth : Double
}

interface CalculateParameters : Dimensions {
    fun area()
    fun perimeter()
}

class XYZ: CalculateParameters{
    override val length : Double
        get() = 10.0
    override val breadth : Double
        get()= 15.0

    override fun area() {
        println("Area is ${length * breadth}")
    }

    override fun perimeter() {
        println("Perimeter is ${2*(length+breadth)}")
    }
}



// *********************** Multiple Interface Implementation *****************************

/*
    Each class can inherit only single class, however, in case of interfaces a class supports multiple inheritance,
    A class can implement more than one interface, provided that it provides a definition for all the members of the
    interface.
 */

interface Interface1 {
    val a : Int
    val b : String
        get() = "Hello"
}

interface Interface2 {
    fun description()
}

class MultipleInterface : Interface1, Interface2 {
    override val a : Int
        get() = 50

    override fun description() {
        println("Multiple Interfaces implemented")
    }
}

fun main() {
    val obj = Car()
    obj.start()
    obj.stop()

    val obj2 = InterfaceDemo()
    obj2.add(b=8)
    obj2.print()

    val x = PropertiesDemo()
    println(x.a)
    println(x.b)

    val obj4 = XYZ()
    obj4.area()
    obj4.perimeter()

    val obj5 = MultipleInterface()
    obj5.description()
    println(obj5.a)
}