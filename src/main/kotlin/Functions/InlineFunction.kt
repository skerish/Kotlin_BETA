package Functions

/*

 In order to reduce the memory overhead of such higher-order functions or lambda expressions,
 we can use the inline keyword which ultimately requests the compiler to not allocate memory
 and simply copy the inlined code of that function at the calling place.

 */

fun main(args: Array<String>){

    higherFunc("A Computer Science portal for Geeks",::println)

    // In Kotlin, if we want to return from a lambda expression then the Kotlin compiler does not allow us to do so.
    // With the help of the inline keyword, we can return from the lambda expression itself and exit the function in
    // which inlined function is called.
    inlinedFunc(
        {
            println("Lambda expression 1")
//            return                        // No error but rest of the code will be ignored
        },
        {
            println("Lambda expression 2")
        }
    )

    inlinedFunc2(
        {
            println("Lambda expression 1")
//            return               // gives error becuase of crossinline modifier
        },
        {
            println("Lambda expression 2")
//            return               // gives error because of noinline modifier that makes it regular lambda function
        }
    )

    genericFunc<String>()
}

inline fun higherFunc(str : String, mycall :(String)-> Unit){
    // invokes the print() by passing the string str
    mycall(str)
}

inline fun inlinedFunc( /*crossinline*/ lmbd1: () -> Unit, noinline lmbd2: () -> Unit  ) {
    lmbd1()
    lmbd2()
}



// ********************** crossinline & noinline modifiers ****************************

// In the program above, return in lambda exits the inline function as well as it's enclosing function.
// So to stop returning from the lambda expression we can mark it using the 'crossline' keyword.
// It will throw a compiler error if sees any return statement in the Lambda expression lmbd1.

// If we want only some of the lambdas passed to an inline function to be inlined, we can mark
// some of the function parameters with the 'noinline' modifier.

inline fun inlinedFunc2( crossinline lmbd1: () -> Unit, noinline lmbd2: () -> Unit  ) {
    lmbd1()
    lmbd2()
}



// *********************** Reified Type Parameters ********************************
inline fun <reified T> genericFunc() {
    println(T::class)
}