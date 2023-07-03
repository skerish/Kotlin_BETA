package OOPs_Concept

// In Kotlin, you can define a class inside another class, which is known as a nested class.
// By default, nested class is static so we can access the nested class property or variables using dot(.) notation
// without creating an object of the class.

// Nested class in Kotlin are equivalent to Static Nested Class in JAVA.

/*
    Nested class can’t access the members of the outer class, but we can access the property of nested class
    from the outer class without creating an object for nested class.
 */

class outerClass {
    var str = "Outer class"

    // nested class declaration
    class nestedClass {

        val firstName  = "Praveen"
        val lastName = "Ruhil"

        var s1 = "Nested class"

        // To access the member function of nested class, we need to create the object for nested class and call the
        // member function using it.
        fun nestfunc(str2: String): String {
            val s2 = s1.plus(str2)
            return s2
        }
    }
}

fun main(){

    // We can access the fields of the nested class without creating an object
    println(outerClass.nestedClass().firstName)
    println(outerClass.nestedClass().lastName)

    // creating object of Nested class to access the methods
    val obj = outerClass.nestedClass()
    val result = obj.nestfunc(" member function call successful")
    println(result)

}