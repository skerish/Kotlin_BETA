package Functions

/*
    In Kotlin, a functions marked with infix keyword can also be called using infix notation means calling without
    using parenthesis and dot.
 */

fun main(args: Array<String>){
    val a = 15

    // call using infix notation
    var res1 = a shr 2
    println("Signed shift right by 2 bit: $res1")

    // call using dot and parenthesis
    var res2 = a.shr(1)
    println("Signed shift right by 1 bit: $res2")

    /*
    User defined infix function notation
    We can create own function with infix notation if the function satisfy the following requirements:

        1. It must be member function or extension function
        2. It must accept a single parameter
        3. The parameter must not accept variable number of arguments and must have no default value
        4. It must be marked with infix keyword
     */

    val obj = Math()
    // call using infix notation
    println(obj square 5)

    println(obj dataType 60)
    println(obj dataType "Hello")

}

class Math{
    // user defined infix member function
    infix fun square(a: Int): Int{
        return a * a
    }

    infix fun dataType(x: Any): Any{
        return when(x){
            is String -> "String"
            is Int -> "Integer"
            is Boolean -> "Boolean"
            is Double -> "Double"
            else -> "Invalid"
        }
    }

    // Infix function calls have lower precedence than the arithmetic operators, type casts, and the rangeTo operator.
    // infix function call have higher precedence than the boolean operators && and ||, is- and in- checks.

}