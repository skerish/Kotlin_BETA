package OOPs_Concept

/**
 *  A Generic type is a class or method that is parameterized over types. We always use angle brackets <> to specify the
 *  type parameter in the program.
 *
 */

class MyCompany(text: String){
    var x = text
    init{
        println(x)
    }
}

class MyNewCompany<T>(text: T){
    var x = text
    init{
        println(x)
    }
}

// ****************************************** Star projections ******************************************
// When we do not know about the specific type of the value and we just want to accept all the elements of an array
// then we use star(*) projection.

fun printArray(array: Array<*>) {
    array.forEach { println(it)}
}

fun main(args: Array<String>){
    var name: MyCompany = MyCompany("GeeksforGeeks")
//    var rank: MyCompany = MyCompany(12)                       // compile time error

    var newName: MyNewCompany<String> = MyNewCompany("Hello World")
    var rank: MyNewCompany<Int> = MyNewCompany(59)


    val n1 = arrayOf("Geeks","for","Geeks", 55, true, 26.87)
    printArray(n1)
}