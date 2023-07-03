package OOPs_Concept

/**
 * Kotlin gives the programmer the ability to add more functionality to the existing classes, without inheriting them.
 * This is achieved through a feature known as extensions. When a function is added to an existing class it is known as
 * Extension Function. To add an extension function to a class, define a new function appended to the classname
 */

class Circle(val radius: Double){
    fun area(): Double{
        return Math.PI * radius * radius
    }
}


// ***************************** Extended library class using extension function ******************************

/**
 * Kotlin not only allows the user-defined classes to be extended but also the library classes can be extended.
 * The extension function can be added to library classes and used in a similar way as for user-defined classes.
 *
 */



// ***************************** Extensions are resolved statically ******************************

/**
 * One important point to note about the extension functions is that they are resolved statically i.e. which extension
 * function is executed depends totally on the type of the expression on which it is invoked, rather than on the type
 * resolved on the final execution of the expression at runtime.
 *
 */

open class AA(val a:Int, val b:Int)

class BB: AA(5, 5)



// ***************************** Nullable Receiver ******************************

/**
 * Extension functions can also be defined with the class type that is nullable. In this case, the check for null
 * is added inside the extension function and the appropriate value is returned.
 */

class AB(val name: String){
    override fun toString(): String {
        return "Name is $name"
    }
}


// ***************************** Companion Object Extensions ******************************

/**
 * If a class contains a companion object, then we can also define extension functions and properties for the
 * companion object.
 */

class MyClass {
    // companion object declaration
    companion object {
        fun display(str: String): String{
            return str
        }
    }
}

// extension function of companion object
fun MyClass.Companion.abc(){
    println("Extension function of companion object")
}

fun main(){
    // Extension function created for a class Circle
    fun Circle.perimeter(): Double{
        return 2*Math.PI*radius;
    }

    val newCircle = Circle(2.5)

    // invoke member function
    println("Area of the circle is ${newCircle.area()}")
    // invoke extension function
    println("Perimeter of the circle is ${newCircle.perimeter()}")

    // The extension function can be added to library classes and used in a similar way as for user-defined classes.
    fun Int.abs() : Int{
        return if(this < 0) -this else this
    }
    println((-4).abs())
    println(4.abs())


    // Extension function operate defined for AA
    fun AA.operate():Int{
        return a+b
    }

    // Extension function operate defined for BB
    fun BB.operate():Int{
        return a*b
    }

    // Function to display static dispatch
    fun display(a: AA){
        println(a.operate())
    }

    // Since the extension functions are statically resolved, the operation function is called on type A.
    display(BB())

    // An extension function as a nullable receiver
    fun AB?.output(){
        if(this == null){
            println("Null")
        }else{
            println(this.toString())
        }
    }

    val x = AB("Charchit")
    // Extension function called using an instance
    x.output()
    // Extension function called on null
    null.output()

    // invoking member function
    val ob = MyClass.display("Function declared in companion object")
    println(ob)
    // invoking the extension function
    val ob2 = MyClass.abc()
}