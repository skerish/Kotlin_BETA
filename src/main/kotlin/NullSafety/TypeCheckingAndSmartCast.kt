package NullSafety

fun main(args: Array<String>){

    // We can check the type of certain variable using the 'is' operator at runtime.

    var name = "Diablo"
    var age = 24
    var salary = 50000.55
    var employeeDetails = listOf(name, age, salary)

    // Kotlin program of type checking using if-else blocks
    for (x in employeeDetails){
        if (x is String)
            println("Name: $name")
        else if (x is Int)
            println("Age is $age")
        else if(x is Double)
            println("Salary is $salary")
        else
            println("Invalid Attribute")
    }

    //  Kotlin program of type checking using 'when'
    for (x in employeeDetails){
        when(x){
            is String -> println("Name: $name")
            is Int -> println("Age is $age")
            is Double -> println("Salary is $salary")
            else -> println("Invalid Attribute")
        }
    }


    // ****************** Smart casting using 'is' operator ********************

    // The Kotlin compiler automatically converts the variable to a particular class reference once it’s passed through
    // any conditional operator.

    // We use is or !is operator to check the type of variable, and compiler automatically casts
    // the variable to the target type

    val str1: String? = "GeeksforGeeks"
    val str2: String? = null
    if(str1 is String)
        println("length of String ${str1.length}")          // No Explicit type Casting needed.
    else
        println("String is null")

    if (str2 !is String)
        println("String is null")
    else
        println("length of String ${str2.length}")



    /*

    Note: Smart cast don’t work when the compiler can’t guarantee that the variable cannot change between the check and
          the usage. Smart casts are applicable according to the following rules:

       - val local variables always works except for local delegated properties.
       - val properties works only if the property is private or internal or the check is performed in the same module where
         the property is declared. Smart casts aren’t applicable to open properties or properties that have custom getters.
       - var local variables works only if the variable is not modified between the check and the usage, is not captured in
         a lambda that modifies it, and is not a local delegated property.
       - var properties – never works because the variable can be modified at any time.

    */

}