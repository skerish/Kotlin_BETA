package OOPs_Concept

// In Kotlin, the default modifier is public.

// ***************************** Public Modifier *******************************

// by default public
class A {
    var int = 10
}

// specified with public modifier
public class B {
    var int2 = 20
    fun display() {
        println("Accessible everywhere")
    }
}



// ***************************** Private Modifier *******************************

// Unlike Java, Kotlin allows multiple top-level declarations in the same file – a private top-level element can be
// accessed by everything else in the same file.

// Here, Class A1 is only accessible from within the same source file, and the int variable is only accessible
// from the inside of class A1.
private class A1 {
    private val int = 10
    fun display() {
        // we can access int in the same class
        println(int)
        println("Accessing int successful")
    }
}



// ***************************** Internal Modifier *******************************

/*
    The internal modifier is a newly added modifier that is not supported by Java. Marked as internal means that it will
    be available in the same module, if we try to access the declaration from another module it will give an error.
    A module means a group of files that are compiled together.
*/

internal class A2 {}

//  Class A2 is only accessible from inside the same module. The variable int and function display() are only accessible
//  from inside the same module, even though class B2 can be accessed from anywhere.
public class B2 {
    internal val int = 10
    internal fun display() {}
}



// ***************************** Protected Modifier *******************************

/*
    The protected modifier strictly allows accessibility to the declaring class and its subclasses. The protected
    modifier can not be declared at the top level.
*/

// Base class
open class A3{
    protected val x = 10
}

// Derived class
class B3: A3(){
    fun getValue(): Int{
        return x
    }
}


// *********************** Overriding of Protected Modifier ************************************

//We need to mark the protected variable or function using an open keywords to override in the derived class.

open class A4 {
    // protected variable
    protected open val num = 10
}

class B4: A4(){
    override val num = 40
    fun getValue():Int {
        // will return the subclass value
        return num
    }
    fun getParentValue(): Int{
        // will return the parent class value
        return super.num
    }
}



// ****************************** Constructor Visibility **************************************

// By default, constructors are public, but we can also change the visibility of a constructor by using the modifiers.

class A5 private constructor (name : String)



fun main() {
    val a = A1()
    a.display()
    // can not access 'int': it is private in class A
//    println(a.int)

    val obj = B3()
    println("Value from super class: ${obj.getValue()}")

    val obj2 = B4()
    println("Overridden value from super class: " + obj2.getValue())
    println("Actual value from super class: " + obj2.getParentValue())
}