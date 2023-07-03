package ArrayAndString

fun main(){

    // Creating an empty String
    var str = String()
    str = "Hello World!"

    println(str)
    println("Lenght: ${str.length}")
    for (i in str.indices)
        print(str[i] + " ")
    println()

    var str2 = "Hello"

    println(str.get(0))
    println(str.subSequence(0,3))       // 0 to 2
    println(str.compareTo(str2))
    println(str.contains(str2))

    // Multiline String
    var str3 = """
        Hi,
        This is
        multiline string.
    """.trimIndent()
    println(str3)


    // ****************** String Equality ****************

    /*
    The two types of equality are:
        1. Structural Equality
        2. Referential Equality
    */

    // "Structural equality" is checked through the == operator and its inverse != operator. By default,
    // the expression containing x==y is translated into the call of equals() function for that type.

    // The "Referential equality" in Kotlin is checked through the === operator and its inverse !== operator.
    // This equality returns true only if both the instances of a type point to the same location in memory.
    // When used on types that are converted into primitives type at runtime, the === check is converted into
    // == check and !== check is converted into != check.

    val x = "GeeksForGeeks"
    val y = "GeeksForGeeks"
    val z = "Geeks"

    var p = StringBuilder("GeeksForGeeks")

    println(x===y) // true , as both are pointing to the same StringPool
    println(x==z)  //false since values are not equal
    println(x===z) // false since values are not equal

    println(x==p.toString())        // true
    println(x===p.toString())       // false

}