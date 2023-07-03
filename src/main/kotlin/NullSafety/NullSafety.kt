/*
    https://www.geeksforgeeks.org/kotlin-null-safety/?ref=lbp
*/

fun main(){

//    var name: String = null   // Non-nullable
    var name: String? = null    // Nullable

    // *************** Safe call operator (?.) ******************

    // Execute an action only when the specific reference holds a non-null value.

    // Option 1
    println("safe call: " + name?.uppercase())

    // Option 2
    if(name != null)
        name?.uppercase()
    else
        null



    // ***************** We can use the safe call operator with let(), also() and run() if value is not null ******************

    val firstName: String? = null
    firstName?.let { println("let: " + it.uppercase()) }      // The lambda expression present inside the let is executed only if the variable firstName is not null.

    // example:
    val stringList: List<String?> = listOf("Geeks","for", null, "Geeks")
    var newList = listOf<String?>()
    for (x in stringList){
        x?.let {
            newList = newList.plus(it)      // plus() is equivalent to add()
        }
        // If we want to apply some additional operation like printing the non-nullable items of the list
        // we can use an also() method and chain it with a let() or run():
        x?.also { it -> println(it) }
        // Similar to let() but inside of a function body, the run() method operates only when we use 'this'
        // reference instead of a function parameter:
        x?.run {
            newList = newList.plus(this)
        }
    }
    for (x in newList) println(x)



    // ************* Elvis operator (?:) ***************

    //  if left expression is not null then elvis operator returns it, otherwise it returns the right expression.
    //  The right-hand side expression is evaluated only if the left-hand side found to be null.

    // Option 1
    val name2 = firstName ?: "Unknown"
    println(name2)

    // Option 2
    val name3 = if(firstName!= null)
        firstName
    else
        "Unknown"
    println(name3)



    // ********************* Notnull assertion operator (!!:) *********************

    // The not null assertion (!!) operator converts any value to a non-null type and throws an exception if the value is null.

    var str : String?  = "GeeksforGeeks"
    var str2 : String? = null
    println(str!!.length)       // str is of null type but !! changed it to non-null type
    println(str2!!.length)      // since str2 is null, the program will throw and exception
}