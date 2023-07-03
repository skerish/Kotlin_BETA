package Functions

fun main(){

    // Syntax:
    // val lambda_name : Data_type = { argument_List -> code_body }

    val result1 = sum1(2,3)
    val result2 = sum2(3,4)
    println("The sum of two numbers is: $result1")
    println("The sum of two numbers is: $result2")

    val res = fun1(9,3)
    println("The sum of two numbers is: $res")

    val result = "Geeks".lambda4(50)
    print(result)


    // it: implicit name of a single parameter
    // In most of cases lambdas contains the single parameter. Here, it is used to represent the single parameter we pass
    // to lambda expression.
    val numbers = arrayOf(1,-2,3,-4,5)
    println(numbers.filter { it > 0 })              // using shorthand form of lambda function
    println(numbers.filter {item -> item > 0 })     // using longhand form of lambda function


    val sum = anonymous1(3,5)
    val mul = anonymous2(3,5)
    println("The sum of two numbers is: $sum")
    println("The multiply of two numbers is: $mul")

}

var sum1 = { a: Int, b: Int -> a+b }
var sum2: (Int, Int) -> Int = { a, b -> a+b }



// *********** Type inference ********************

//  Kotlin’s type inference helps the compiler to evaluate the type of lambda expression.
//  In the below code, Kotlin compiler self evaluate it as a function which takes two integer values and returns String.
// (Int, Int) -> String

val fun1 = {a: Int, b: Int ->
    val num = a + b
    num.toString()
    num.plus(50)
}



// ********************* Type Declaration **************************

// We must explicitly declare the type of our lambda expression. If lambda returns no value then we can use: Unit(void in java)
// Pattern: (Input) -> Output

val lambda1: (Int) -> Int = {a -> a * a}
val lambda2: (String,String) -> String = { a , b -> a.plus(b)}
val lambda3: (Int)-> Unit = {println(Int)}

// Lambdas can be used as class extension. 'it' represents the implicit name of single parameter

// 'this' keyword is used for the string and 'it' keyword is used for the Int parameter passed in the lambda.
val lambda4: String.(Int) -> String = {this + it}



// ************************** Anonymous Function ***************************

/*
 An anonymous function is very similar to regular function except for the name of the function which is omitted
 from the declaration. The body of the anonymous function can be either an expression or block.
 */

// anonymous function with body as an expression
val anonymous1 = fun(x: Int, y: Int): Int = x + y

// anonymous function with body as a block
val anonymous2 = fun(a: Int, b: Int): Int {
    val mul = a * b
    return mul
}