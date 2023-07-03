package OOPs_Concept

/*
    An abstract class is a class that cannot be instantiated and is meant to be subclassed. An abstract class may
    contain both abstract methods(methods without a body) and concrete methods(methods with a body).

        1. We can’t create an object for abstract class.
        2. All the variables(properties) and member functions of an abstract class are by default non-abstract.
            So, if we want to override these members in the child class then we need to use open keyword.
        If we declare a member function as abstract, then we do not need to annotate with open keyword because these
        are open by default. An abstract member function does not have a body, and it must be implemented in the derived class.
 */

abstract class PS_Employee(val name: String, val experience: Int) {   // Non-Abstract

    // Abstract Property (Must be overridden by Subclasses)
    abstract var salary: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun dateOfBirth(date:String)

    // Non-Abstract Method
    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }
}

class Engineer(name: String, experience: Int) : PS_Employee(name,experience) {
    override var salary = 500000.00
    override fun dateOfBirth(date:String){
        println("Date of Birth is: $date")
    }
}



// ************************* Overriding a non-abstract open member with an abstract one *******************************

// we can override the non-abstract open member function of the open class using the override keyword followed by an
// abstract in the abstract class.

open class LivingThings {
    open fun breathe() {
        println("All living things breathe")
    }
}

abstract class WildAnimal : LivingThings() {
    abstract override fun breathe()
}

class Dog: WildAnimal(){
    override fun breathe() {
        println("Dog can also breathe")
    }
}

// An abstract member of an abstract class can be overridden in all the derived classes.
class Cat: WildAnimal(){
    override fun breathe() {
        println("Cat can also breathe")
    }
}

fun main(args: Array<String>) {
    val eng = Engineer("Praveen",2)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1994")

    val lt = LivingThings()
    lt.breathe()
    val d = Dog()
    d.breathe()
    val c = Cat()
    c.breathe()
}