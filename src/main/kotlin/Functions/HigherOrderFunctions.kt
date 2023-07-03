package Functions

/*
    In Kotlin, a function which can accept a function as parameter or can return a function is called Higher-Order function.
    Instead of Integer, String or Array as a parameter to function, we will pass anonymous function or lambdas.
 */

fun main(){

    higherOrderFun(lambdaFun)
    higherOrderFun2(lambdaFun2)

    higherFunction("Hello Geek",::printMe)
    higherFunction2(::addMe)

    val multiply = higherFunction3()
    val res = multiply(7,5)
    println("Multiplication Result is $res")
}

// ************************* Passing lambda expression as a parameter to Higher-Order Function ************************

// 1. Lambda expression which returns Unit
var lambdaFun = { println("Hello World") }

// 2. Lambda expression which returns Integer value
var lambdaFun2 = { a: Int, b: Int -> a + b }

fun higherOrderFun( lmbd: () -> Unit){
    lmbd()
}

fun higherOrderFun2(lmbd : (Int, Int)-> Int){
    println(lmbd(4,5))
}

// **************************** Passing function as a parameter to Higher-Order function ******************************

// 1. Function which return Unit
fun printMe(s: String) {
    println(s)
}

fun higherFunction(str: String, myFun: (String) -> Unit){
    myFun(str)
}

// 2. Function which returns integer value
fun addMe(a: Int, b: Int): Int{
    return a+b
}

fun higherFunction2(add: (Int, Int) -> Int){
    val res = add(5,9)
    println("Sum is $res")
}

// ************************** Returning a function from Higher-Order function **************************

// While returning the function, we have to specify the parameter types and return type of regular function
// in the return type of the higher-order function.

fun multi(a: Int, b: Int): Int{
    return a*b
}

fun higherFunction3(): (Int,Int) -> Int {
    return ::multi
}

