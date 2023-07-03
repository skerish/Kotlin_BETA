package OOPs_Concept

/*
    A property in a class is declared the same as declaring a variable with val and var keywords.
    A property declared as var is mutable and thus, can be changed.

    Readable Property: Generates a field and a trivial getter (eg. val name)
    Writable Property: Gemerates a getter, a setter, and a field (eg. var dob)

 */

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean               // Custom implementation of property accessor
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {

    //  In Kotlin, the constructor can be called without a new keyword.
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)

    // The property isSquare needs no field to store the value. It only has a custom getter with the implementation provided.
    // Every time the property is accessed, the value is computed.
}