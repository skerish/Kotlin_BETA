package OOPs_Concept

/*
    In Kotlin, all classes are final by default.  To permit the derived class to inherit from the base class,
    we must use the open keyword in front of the base class.
*/

open class Employee(name: String, age: Int) {
    init {
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}

// If the derived class contains a primary constructor, then we need to initialize the base class constructor using
// the parameters of the derived class.
class CEO(name: String, age: Int, salary: Double): Employee(name, age) {
    init {
        println("Salary per annum is $salary crore rupees")
    }
}



open class Employee2 {
    constructor(name: String,age: Int){
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}

// If the derived class does not contain a primary constructor, we need to call the base class secondary constructor
// from the secondary constructor of derived class using the super keyword. We also need to initialize the base class
// secondary constructor using the parameters of the derived class.
class CEO2 : Employee2{
    // If super(name, age) is not provided then by default compiler will call super() constructor of the base class therefore
    // a non-arg constructor should be present in the base class otherwise it will throw compile time error.
    constructor( name: String,age: Int, salary: Double): super(name,age) {
        println("Salary per annum is $salary million dollars")
    }

}


//************************************* Overriding Member functions and properties *************************************

/*
    If the base class and derived class contain a member function with the same name, then we can override the base
    member function in the derived class using the override keyword and also need to mark the member function of the
    base class with open keyword.
*/


open class Animal{
    open val kind = "Omnivore"
    open fun run(){
        println("Animal is running")
    }
}

// We can also call the base class member functions or properties from the derived class using the super keyword.

class Tiger: Animal(){
    override val kind = "Carnivore"
    override fun run(){
        println("Tiger is running")
    }
    fun getParentValue(){
        println("Parent kind is ${super.kind}")
        super.run()
    }
}

fun main(args: Array<String>) {
    CEO("Sunder Pichai", 42, 450.00)
    CEO2("Satya Nadela", 48, 250.00)

    val obj = Tiger()
    obj.run()
    println(obj.kind)
    obj.getParentValue()
}